/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.pubsublite.internal.wire;

import com.google.auto.value.AutoValue;
import com.google.cloud.pubsublite.Partition;
import com.google.cloud.pubsublite.ProjectLookupUtils;
import com.google.cloud.pubsublite.Stubs;
import com.google.cloud.pubsublite.SubscriptionPath;
import com.google.cloud.pubsublite.proto.CursorServiceGrpc;
import com.google.cloud.pubsublite.proto.CursorServiceGrpc.CursorServiceStub;
import com.google.cloud.pubsublite.proto.InitialCommitCursorRequest;
import io.grpc.StatusException;
import java.util.Optional;

@AutoValue
public abstract class CommitterBuilder {
  // Required parameters.
  abstract SubscriptionPath subscriptionPath();

  abstract Partition partition();

  // Optional parameters.
  abstract Optional<CursorServiceStub> cursorStub();

  public static Builder newBuilder() {
    return new AutoValue_CommitterBuilder.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {
    // Required parameters.
    public abstract Builder setSubscriptionPath(SubscriptionPath path);

    public abstract Builder setPartition(Partition partition);

    // Optional parameters.
    public abstract Builder setCursorStub(CursorServiceStub stub);

    abstract CommitterBuilder autoBuild();

    @SuppressWarnings("CheckReturnValue")
    public Committer build() throws StatusException {
      CommitterBuilder builder = autoBuild();

      CursorServiceStub cursorStub;
      if (builder.cursorStub().isPresent()) {
        cursorStub = builder.cursorStub().get();
      } else {
        cursorStub =
            Stubs.defaultStub(
                builder.subscriptionPath().location().region(), CursorServiceGrpc::newStub);
      }

      InitialCommitCursorRequest initialCommitCursorRequest =
          InitialCommitCursorRequest.newBuilder()
              .setSubscription(
                  ProjectLookupUtils.toCannonical(builder.subscriptionPath()).toString())
              .setPartition(builder.partition().value())
              .build();
      return new CommitterImpl(cursorStub, initialCommitCursorRequest);
    }
  }
}
