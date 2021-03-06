/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LoggerType.
 */
public final class LoggerType extends ExpandableStringEnum<LoggerType> {
    /** Static value azureEventHub for LoggerType. */
    public static final LoggerType AZURE_EVENT_HUB = fromString("azureEventHub");

    /** Static value applicationInsights for LoggerType. */
    public static final LoggerType APPLICATION_INSIGHTS = fromString("applicationInsights");

    /**
     * Creates or finds a LoggerType from its string representation.
     * @param name a name to look for
     * @return the corresponding LoggerType
     */
    @JsonCreator
    public static LoggerType fromString(String name) {
        return fromString(name, LoggerType.class);
    }

    /**
     * @return known LoggerType values
     */
    public static Collection<LoggerType> values() {
        return values(LoggerType.class);
    }
}
