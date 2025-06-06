/**
 * (C) Copyright 2022 Araf Karsh Hamid
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fusion.water.order.domain.exceptions;

import org.springframework.http.HttpStatus;

/**
 * @author: Araf Karsh Hamid
 * @version:
 * @date:
 */
public class DatabaseException extends AbstractServiceException {

    /**
     * Database Exception - Bad Request
     * @param msg
     */
    public DatabaseException(String msg) {
        super(msg);
    }

    /**
     * Database Exception - Bad Request
     * @param e
     */
    public DatabaseException(Throwable e) {
        super(e);
    }

    /**
     * Database Exception - Bad Request
     * @param msg
     * @param e
     */
    public DatabaseException(String msg, Throwable e) {
        super(msg, e);
    }

    /**
     * Database Exception
     * @param msg
     * @param badRequest
     * @param e
     */
    public DatabaseException(String msg, HttpStatus badRequest, Throwable e) {
        super(msg, badRequest, e);
    }
}
