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

package com.google.cloud.pubsublite.beam;

import static com.google.cloud.pubsublite.internal.Preconditions.checkArgument;

import com.google.auto.value.AutoValue;
import com.google.cloud.pubsublite.SequencedMessage;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.ByteString;
import java.io.Serializable;
import org.apache.beam.sdk.state.TimeDomain;
import org.apache.beam.sdk.transforms.Deduplicate;

@AutoValue
public abstract class UuidDeduplicationOptions implements Serializable {
  private static final long serialVersionUID = 9837489720893L;

  public static final SerializableStatusFunction<SequencedMessage, Uuid> DEFAULT_UUID_EXTRACTOR =
      message -> {
        checkArgument(
            message.message().attributes().containsKey(Uuid.DEFAULT_ATTRIBUTE),
            "Uuid attribute missing.");
        ImmutableList<ByteString> attributes =
            message.message().attributes().get(Uuid.DEFAULT_ATTRIBUTE);
        checkArgument(attributes.size() == 1, "Duplicate Uuid attribute values exist.");
        return Uuid.of(attributes.get(0));
      };

  public static final int DEFAULT_HASH_PARTITIONS = 10000;

  // All parameters are optional.
  public abstract SerializableStatusFunction<SequencedMessage, Uuid> uuidExtractor();

  public abstract Deduplicate.KeyedValues<Uuid, SequencedMessage> deduplicate();

  // The number of partitions to hash values into.
  public abstract int hashPartitions();

  @SuppressWarnings("CheckReturnValue")
  public static Builder newBuilder() {
    Builder builder = new AutoValue_UuidDeduplicationOptions.Builder();
    builder.setUuidExtractor(DEFAULT_UUID_EXTRACTOR);
    builder.setDeduplicate(
        Deduplicate.<Uuid, SequencedMessage>keyedValues().withTimeDomain(TimeDomain.EVENT_TIME));
    builder.setHashPartitions(DEFAULT_HASH_PARTITIONS);
    return builder;
  }

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setUuidExtractor(
        SerializableStatusFunction<SequencedMessage, Uuid> uuidExtractor);

    public abstract Builder setDeduplicate(
        Deduplicate.KeyedValues<Uuid, SequencedMessage> deduplicate);

    public abstract Builder setHashPartitions(int partitions);

    public abstract UuidDeduplicationOptions build();
  }
}
