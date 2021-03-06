/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Output for connect to MySQL type source.
 */
public class ConnectToSourceNonSqlTaskOutput {
    /**
     * Result identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Server brand version.
     */
    @JsonProperty(value = "sourceServerBrandVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerBrandVersion;

    /**
     * Server properties.
     */
    @JsonProperty(value = "serverProperties", access = JsonProperty.Access.WRITE_ONLY)
    private ServerProperties serverProperties;

    /**
     * List of databases on the server.
     */
    @JsonProperty(value = "databases", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> databases;

    /**
     * Validation errors associated with the task.
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /**
     * Get result identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get server brand version.
     *
     * @return the sourceServerBrandVersion value
     */
    public String sourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }

    /**
     * Get server properties.
     *
     * @return the serverProperties value
     */
    public ServerProperties serverProperties() {
        return this.serverProperties;
    }

    /**
     * Get list of databases on the server.
     *
     * @return the databases value
     */
    public List<String> databases() {
        return this.databases;
    }

    /**
     * Get validation errors associated with the task.
     *
     * @return the validationErrors value
     */
    public List<ReportableException> validationErrors() {
        return this.validationErrors;
    }

}
