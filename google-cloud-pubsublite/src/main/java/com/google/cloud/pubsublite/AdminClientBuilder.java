// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.cloud.pubsublite;

import com.google.api.gax.retrying.RetrySettings;
import com.google.auto.value.AutoValue;
import com.google.cloud.pubsublite.internal.AdminClientImpl;
import com.google.cloud.pubsublite.proto.AdminServiceGrpc;
import com.google.cloud.pubsublite.proto.AdminServiceGrpc.AdminServiceBlockingStub;
import io.grpc.Status;
import io.grpc.StatusException;
import java.io.IOException;
import java.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import org.threeten.bp.Duration;

@AutoValue
public abstract class AdminClientBuilder {
  public static final RetrySettings DEFAULT_RETRY_SETTINGS =
      RetrySettings.newBuilder()
          .setInitialRetryDelay(Duration.ofMillis(100))
          .setRetryDelayMultiplier(1.3)
          .setMaxRetryDelay(Duration.ofSeconds(60))
          .setJittered(true)
          .setTotalTimeout(Duration.ofMinutes(10))
          .build();

  // Required parameters.
  abstract CloudRegion region();

  abstract ScheduledExecutorService executor();

  // Optional parameters.
  abstract Optional<RetrySettings> retrySettings();

  abstract Optional<AdminServiceBlockingStub> stub();

  public static Builder builder() {
    return new AutoValue_AdminClientBuilder.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {
    // Required parameters.
    public abstract Builder setRegion(CloudRegion region);

    public abstract Builder setExecutor(ScheduledExecutorService executor);

    // Optional parameters.
    public abstract Builder setRetrySettings(RetrySettings retrySettings);

    public abstract Builder setStub(AdminServiceBlockingStub stub);

    abstract AdminClientBuilder autoBuild();

    public AdminClient build() throws StatusException {
      AdminClientBuilder builder = autoBuild();
      AdminServiceBlockingStub stub;
      if (builder.stub().isPresent()) {
        stub = builder.stub().get();
      } else {
        try {
          stub =
              Stubs.defaultStub(
                  Endpoints.adminEndpoint(builder.region()), AdminServiceGrpc::newBlockingStub);
        } catch (IOException e) {
          throw Status.INTERNAL
              .withCause(e)
              .withDescription("Creating admin stub failed.")
              .asException();
        }
      }
      return new AdminClientImpl(
          builder.region(),
          stub,
          builder.retrySettings().orElse(DEFAULT_RETRY_SETTINGS),
          builder.executor());
    }
  }
}
