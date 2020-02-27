/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for JsonWriteFilePattern.
 */
public final class JsonWriteFilePattern extends ExpandableStringEnum<JsonWriteFilePattern> {
    /** Static value setOfObjects for JsonWriteFilePattern. */
    public static final JsonWriteFilePattern SET_OF_OBJECTS = fromString("setOfObjects");

    /** Static value arrayOfObjects for JsonWriteFilePattern. */
    public static final JsonWriteFilePattern ARRAY_OF_OBJECTS = fromString("arrayOfObjects");

    /**
     * Creates or finds a JsonWriteFilePattern from its string representation.
     * @param name a name to look for
     * @return the corresponding JsonWriteFilePattern
     */
    @JsonCreator
    public static JsonWriteFilePattern fromString(String name) {
        return fromString(name, JsonWriteFilePattern.class);
    }

    /**
     * @return known JsonWriteFilePattern values
     */
    public static Collection<JsonWriteFilePattern> values() {
        return values(JsonWriteFilePattern.class);
    }
}