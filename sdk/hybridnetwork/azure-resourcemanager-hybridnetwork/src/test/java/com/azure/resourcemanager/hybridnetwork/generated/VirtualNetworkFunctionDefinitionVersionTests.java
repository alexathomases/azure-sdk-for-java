// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.VirtualNetworkFunctionDefinitionVersion;
import com.azure.resourcemanager.hybridnetwork.models.VirtualNetworkFunctionTemplate;
import org.junit.jupiter.api.Assertions;

public final class VirtualNetworkFunctionDefinitionVersionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworkFunctionDefinitionVersion model = BinaryData.fromString(
            "{\"networkFunctionType\":\"VirtualNetworkFunction\",\"networkFunctionTemplate\":{\"nfviType\":\"VirtualNetworkFunctionTemplate\"},\"provisioningState\":\"Failed\",\"versionState\":\"ValidationFailed\",\"description\":\"xvxcjzhq\",\"deployParameters\":\"xfpxtgqscja\"}")
            .toObject(VirtualNetworkFunctionDefinitionVersion.class);
        Assertions.assertEquals("xvxcjzhq", model.description());
        Assertions.assertEquals("xfpxtgqscja", model.deployParameters());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworkFunctionDefinitionVersion model
            = new VirtualNetworkFunctionDefinitionVersion().withDescription("xvxcjzhq")
                .withDeployParameters("xfpxtgqscja")
                .withNetworkFunctionTemplate(new VirtualNetworkFunctionTemplate());
        model = BinaryData.fromObject(model).toObject(VirtualNetworkFunctionDefinitionVersion.class);
        Assertions.assertEquals("xvxcjzhq", model.description());
        Assertions.assertEquals("xfpxtgqscja", model.deployParameters());
    }
}
