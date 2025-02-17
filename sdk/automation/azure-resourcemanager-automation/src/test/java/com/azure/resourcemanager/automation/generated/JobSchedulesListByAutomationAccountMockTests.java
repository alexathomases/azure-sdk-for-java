// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.automation.AutomationManager;
import com.azure.resourcemanager.automation.models.JobSchedule;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class JobSchedulesListByAutomationAccountMockTests {
    @Test
    public void testListByAutomationAccount() throws Exception {
        String responseStr
            = "{\"value\":[{\"id\":\"bjtvgjsxmtyjj\",\"name\":\"vdpwwobtdphti\",\"type\":\"ffofwan\",\"properties\":{\"jobScheduleId\":\"scauwazcgwdfr\",\"schedule\":{\"name\":\"ybjpozoks\"},\"runbook\":{\"name\":\"llixdgbyfgw\"},\"runOn\":\"qkjvxprwpxsoohu\",\"parameters\":{\"lfb\":\"cskltezuuggg\",\"srtmdylperpiltt\":\"rdcgu\"}}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AutomationManager manager = AutomationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<JobSchedule> response = manager.jobSchedules()
            .listByAutomationAccount("zlwhbwzjnufzrfgm", "qgnnbz", "tftedz", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("scauwazcgwdfr", response.iterator().next().jobScheduleId());
        Assertions.assertEquals("ybjpozoks", response.iterator().next().schedule().name());
        Assertions.assertEquals("llixdgbyfgw", response.iterator().next().runbook().name());
        Assertions.assertEquals("qkjvxprwpxsoohu", response.iterator().next().runOn());
        Assertions.assertEquals("cskltezuuggg", response.iterator().next().parameters().get("lfb"));
    }
}
