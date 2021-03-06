/*
 * Copyright 2016 Mohamed Kiswani.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.rhkiswani.javaff.exceptions;

import io.github.rhkiswani.javaff.log.Log;
import io.github.rhkiswani.javaff.log.LogFactory;

/**
 * @author Mohamed Kiswani
 * @since 0.0.1
 * @see io.github.rhkiswani.javaff.exceptions.ExceptionHandler
 *
 */
class DefaultExceptionHandler implements ExceptionHandler{
    private static final Log LOGGER = LogFactory.getLogger(DefaultExceptionHandler.class);

    public void handle(Throwable t){
        if (!Boolean.valueOf(System.getProperty("isTest", "false"))) {
            LOGGER.error(t.getMessage(), t);
        }
    }
}
