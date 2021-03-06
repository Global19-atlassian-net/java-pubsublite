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

package com.google.cloud.pubsublite.cloudpubsub;

import com.google.api.core.ApiService;
import com.google.cloud.pubsub.v1.PublisherInterface;
import io.grpc.StatusException;

/** Pub/Sub Lite publishers are streaming based and can experience permanent errors. */
public interface Publisher extends PublisherInterface, ApiService {
  /** Create a new Pub/Sub Lite publisher using the provided settings. */
  static Publisher create(PublisherSettings settings) throws StatusException {
    return settings.instantiate();
  }
}
