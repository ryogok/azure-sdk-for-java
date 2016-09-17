/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network.model;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.apigeneration.LangDefinition.MethodConversion;

/**
 * An interface representing a model's ability to have floating IP support.
 */
@LangDefinition()
public interface HasFloatingIp {
    /**
     * @return the state of the floating IP enablement
     */
    boolean floatingIpEnabled();

    /**
     * Grouping of definition stages involving enabling or disabling floating IP support.
     */
    @LangDefinition(
                ContainerName = "Definition",
                ContainerFileName = "IDefinition",
                IsContainerOnly = true,
                MethodConversionType = MethodConversion.OnlyMethod)
    interface DefinitionStages {
        /**
         * The stage of a definition allowing to control floating IP support.
         * @param <ReturnT> the next stage of the definition
         */
        interface WithFloatingIp<ReturnT> {
            /**
             * Enables floating IP support.
             * @return the next stage of the definition
             */
            ReturnT withFloatingIpEnabled();

            /**
             * Disables floating IP support.
             * @return the next stage of the definition
             */
            ReturnT withFloatingIpDisabled();

            /**
             * Sets the floating IP enablement. 
             * @param enabled true if floating IP should be enabled
             * @return the next stage of the definition
             */
            ReturnT withFloatingIp(boolean enabled);
        }
    }

    /**
     * Grouping of update stages involving enabling or disabling floating IP support.
     */
    @LangDefinition(
                ContainerName = "Update",
                ContainerFileName = "IUpdate",
                IsContainerOnly = true,
                MethodConversionType = MethodConversion.OnlyMethod)
    interface UpdateStages {
        /**
         * The stage of a definition allowing to control floating IP support.
         * @param <ReturnT> the next stage of the definition
         */
        interface WithFloatingIp<ReturnT> {
            /**
             * Enables floating IP support.
             * @return the next stage of the definition
             */
            ReturnT withFloatingIpEnabled();

            /**
             * Disables floating IP support.
             * @return the next stage of the definition
             */
            ReturnT withFloatingIpDisabled();

            /**
             * Sets the floating IP enablement. 
             * @param enabled true if floating IP should be enabled
             * @return the next stage of the definition
             */
            ReturnT withFloatingIp(boolean enabled);
        }
    }


    /**
     * Grouping of definition stages applicable as part of a load balancer update, involving enabling or disabling floating IP support.
     */
    @LangDefinition(
                ContainerName = "UpdateDefinition",
                ContainerFileName = "IUpdateDefinition",
                IsContainerOnly = true,
                MethodConversionType = MethodConversion.OnlyMethod)
    interface UpdateDefinitionStages {
        /**
         * The stage of a definition allowing to control floating IP support.
         * @param <ReturnT> the next stage of the definition
         */
        interface WithFloatingIp<ReturnT> {
            /**
             * Enables floating IP support.
             * @return the next stage of the definition
             */
            ReturnT withFloatingIpEnabled();

            /**
             * Disables floating IP support.
             * @return the next stage of the definition
             */
            ReturnT withFloatingIpDisabled();

            /**
             * Sets the floating IP enablement. 
             * @param enabled true if floating IP should be enabled
             * @return the next stage of the definition
             */
            ReturnT withFloatingIp(boolean enabled);
        }
    }
}
