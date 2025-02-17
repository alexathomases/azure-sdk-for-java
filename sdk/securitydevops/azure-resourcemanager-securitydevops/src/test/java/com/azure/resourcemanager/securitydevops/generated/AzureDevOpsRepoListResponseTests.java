// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securitydevops.fluent.models.AzureDevOpsRepoInner;
import com.azure.resourcemanager.securitydevops.models.AzureDevOpsRepoListResponse;
import com.azure.resourcemanager.securitydevops.models.AzureDevOpsRepoProperties;
import com.azure.resourcemanager.securitydevops.models.ProvisioningState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureDevOpsRepoListResponseTests {
    @Test
    public void testDeserialize() {
        AzureDevOpsRepoListResponse model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Canceled\",\"repoId\":\"lzydehojwyahux\",\"repoUrl\":\"pmqnja\",\"orgName\":\"ixjsprozvcputeg\",\"projectName\":\"wmfdatscmdvpjhul\",\"visibility\":\"uvm\"},\"id\":\"zkrwfn\",\"name\":\"iodjp\",\"type\":\"lwejdpv\"},{\"properties\":{\"provisioningState\":\"Canceled\",\"repoId\":\"psoacctazakljl\",\"repoUrl\":\"bcryffdfd\",\"orgName\":\"ygexpaojakhmsb\",\"projectName\":\"hcrzevd\",\"visibility\":\"lxaolthqtrgqjbp\"},\"id\":\"s\",\"name\":\"n\",\"type\":\"gvfcj\"},{\"properties\":{\"provisioningState\":\"Failed\",\"repoId\":\"xjtfelluwfzit\",\"repoUrl\":\"peqfpjkjl\",\"orgName\":\"fpdvhpfxxypi\",\"projectName\":\"nmayhuybb\",\"visibility\":\"odepoogin\"},\"id\":\"mihe\",\"name\":\"gnarxzxtheo\",\"type\":\"usivye\"}],\"nextLink\":\"ciqihnhung\"}")
            .toObject(AzureDevOpsRepoListResponse.class);
        Assertions.assertEquals(ProvisioningState.CANCELED, model.value().get(0).properties().provisioningState());
        Assertions.assertEquals("lzydehojwyahux", model.value().get(0).properties().repoId());
        Assertions.assertEquals("pmqnja", model.value().get(0).properties().repoUrl());
        Assertions.assertEquals("ixjsprozvcputeg", model.value().get(0).properties().orgName());
        Assertions.assertEquals("wmfdatscmdvpjhul", model.value().get(0).properties().projectName());
        Assertions.assertEquals("uvm", model.value().get(0).properties().visibility());
        Assertions.assertEquals("ciqihnhung", model.nextLink());
    }

    @Test
    public void testSerialize() {
        AzureDevOpsRepoListResponse model = new AzureDevOpsRepoListResponse().withValue(Arrays.asList(
            new AzureDevOpsRepoInner()
                .withProperties(new AzureDevOpsRepoProperties().withProvisioningState(ProvisioningState.CANCELED)
                    .withRepoId("lzydehojwyahux")
                    .withRepoUrl("pmqnja")
                    .withOrgName("ixjsprozvcputeg")
                    .withProjectName("wmfdatscmdvpjhul")
                    .withVisibility("uvm")),
            new AzureDevOpsRepoInner()
                .withProperties(new AzureDevOpsRepoProperties().withProvisioningState(ProvisioningState.CANCELED)
                    .withRepoId("psoacctazakljl")
                    .withRepoUrl("bcryffdfd")
                    .withOrgName("ygexpaojakhmsb")
                    .withProjectName("hcrzevd")
                    .withVisibility("lxaolthqtrgqjbp")),
            new AzureDevOpsRepoInner()
                .withProperties(new AzureDevOpsRepoProperties().withProvisioningState(ProvisioningState.FAILED)
                    .withRepoId("xjtfelluwfzit")
                    .withRepoUrl("peqfpjkjl")
                    .withOrgName("fpdvhpfxxypi")
                    .withProjectName("nmayhuybb")
                    .withVisibility("odepoogin"))))
            .withNextLink("ciqihnhung");
        model = BinaryData.fromObject(model).toObject(AzureDevOpsRepoListResponse.class);
        Assertions.assertEquals(ProvisioningState.CANCELED, model.value().get(0).properties().provisioningState());
        Assertions.assertEquals("lzydehojwyahux", model.value().get(0).properties().repoId());
        Assertions.assertEquals("pmqnja", model.value().get(0).properties().repoUrl());
        Assertions.assertEquals("ixjsprozvcputeg", model.value().get(0).properties().orgName());
        Assertions.assertEquals("wmfdatscmdvpjhul", model.value().get(0).properties().projectName());
        Assertions.assertEquals("uvm", model.value().get(0).properties().visibility());
        Assertions.assertEquals("ciqihnhung", model.nextLink());
    }
}
