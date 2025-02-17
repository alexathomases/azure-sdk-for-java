// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.automation.AutomationManager;
import com.azure.resourcemanager.automation.models.Variable;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class VariablesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"value\":\"vxodgwxfkzs\",\"isEncrypted\":true,\"creationTime\":\"2021-04-28T09:12:44Z\",\"lastModifiedTime\":\"2021-12-03T02:20:55Z\",\"description\":\"jgc\"},\"id\":\"xvecbbwjt\",\"name\":\"dxrizagb\",\"type\":\"giarksykpgdqxw\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AutomationManager manager = AutomationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Variable response = manager.variables()
            .getWithResponse("zuscstunmlh", "dfb", "lciichgjs", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("vxodgwxfkzs", response.value());
        Assertions.assertEquals(true, response.isEncrypted());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-28T09:12:44Z"), response.creationTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-03T02:20:55Z"), response.lastModifiedTime());
        Assertions.assertEquals("jgc", response.description());
    }
}
