/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error details for the operation in case of a failure.
 */
public class OperationError {
    /**
     * The error code of the operation error.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * The error message of the operation error.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the error code of the operation error.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the error code of the operation error.
     *
     * @param code the code value to set
     * @return the OperationError object itself.
     */
    public OperationError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the error message of the operation error.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the error message of the operation error.
     *
     * @param message the message value to set
     * @return the OperationError object itself.
     */
    public OperationError withMessage(String message) {
        this.message = message;
        return this;
    }

}
