/**
 * (c) Copyright 2013 WibiData, Inc.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kiji.mapreduce.lib.reduce;

import java.io.IOException;

import org.apache.avro.Schema;

import org.kiji.mapreduce.lib.avro.Node;

/**
 * Base class for reducers that use a Node for the input and output value.
 *
 * @param <K> The MapReduce key (same is used for input/output).
 */
public abstract class NodeValueReducer<K> extends AvroValueReducer<K, Node> {
  /** {@inheritDoc} */
  @Override
  public Schema getAvroValueWriterSchema() throws IOException {
    return Node.SCHEMA$;
  }
}
