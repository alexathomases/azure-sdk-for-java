// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.NameAvailabilityInformationInner;

public final class NameAvailabilityInformationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NameAvailabilityInformationInner model
            = BinaryData.fromString("{\"nameAvailable\":false,\"reason\":\"fovasr\",\"message\":\"v\"}")
                .toObject(NameAvailabilityInformationInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NameAvailabilityInformationInner model = new NameAvailabilityInformationInner();
        model = BinaryData.fromObject(model).toObject(NameAvailabilityInformationInner.class);
    }
}
