/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01.implementation;

import com.microsoft.azure.management.databox.v2019_09_01.RegionConfigurationResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.databox.v2019_09_01.ScheduleAvailabilityResponse;
import com.microsoft.azure.management.databox.v2019_09_01.TransportAvailabilityResponse;

class RegionConfigurationResponseImpl extends WrapperImpl<RegionConfigurationResponseInner> implements RegionConfigurationResponse {
    private final DataBoxManager manager;
    RegionConfigurationResponseImpl(RegionConfigurationResponseInner inner, DataBoxManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataBoxManager manager() {
        return this.manager;
    }

    @Override
    public ScheduleAvailabilityResponse scheduleAvailabilityResponse() {
        return this.inner().scheduleAvailabilityResponse();
    }

    @Override
    public TransportAvailabilityResponse transportAvailabilityResponse() {
        return this.inner().transportAvailabilityResponse();
    }

}