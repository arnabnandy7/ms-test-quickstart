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
public class DataVersionMismatchException extends DatabaseException {

    /**
     * Data Version Mismatch Exception
     * @param msg
     */
    public DataVersionMismatchException(String msg) {
        super(msg);
    }

    /**
     * Data Version Mismatch Exception
     * @param msg
     * @param e
     */
    public DataVersionMismatchException(String msg, Throwable e) {
        super(msg, HttpStatus.BAD_REQUEST, e);
    }

    /**
     * Data Version Mismatch Exception
     * @param e
     */
    public DataVersionMismatchException(Throwable e) {
        super("Duplicate Data Exception!", HttpStatus.BAD_REQUEST, e);
    }
}
