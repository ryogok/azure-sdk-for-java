/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation.GalleryImageInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation.DevTestLabsManager;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing GalleryImage.
 */
public interface GalleryImage extends HasInner<GalleryImageInner>, HasManager<DevTestLabsManager> {
    /**
     * @return the author value.
     */
    String author();

    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the icon value.
     */
    String icon();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the imageReference value.
     */
    GalleryImageReference imageReference();

    /**
     * @return the isPlanAuthorized value.
     */
    Boolean isPlanAuthorized();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the planId value.
     */
    String planId();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}
