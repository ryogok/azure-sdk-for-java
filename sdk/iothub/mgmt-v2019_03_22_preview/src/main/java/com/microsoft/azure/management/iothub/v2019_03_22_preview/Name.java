/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Name of Iot Hub type.
 */
public class Name {
    /**
     * IotHub type.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Localized value of name.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Get iotHub type.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set iotHub type.
     *
     * @param value the value value to set
     * @return the Name object itself.
     */
    public Name withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get localized value of name.
     *
     * @return the localizedValue value
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set localized value of name.
     *
     * @param localizedValue the localizedValue value to set
     * @return the Name object itself.
     */
    public Name withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

}
