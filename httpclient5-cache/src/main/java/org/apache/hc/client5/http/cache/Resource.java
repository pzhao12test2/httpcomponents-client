/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
package org.apache.hc.client5.http.cache;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

/**
 * Represents a disposable system resource used for handling
 * cached response bodies.
 *
 * @since 4.1
 */
public interface Resource extends Serializable {

    /**
     * Returns an {@link InputStream} from which the response
     * body can be read.
     * @throws IOException
     */
    InputStream getInputStream() throws IOException;

    /**
     * Returns the length in bytes of the response body.
     */
    long length();

    /**
     * Indicates the system no longer needs to keep this
     * response body and any system resources associated with
     * it may be reclaimed.
     */
    void dispose();

}
