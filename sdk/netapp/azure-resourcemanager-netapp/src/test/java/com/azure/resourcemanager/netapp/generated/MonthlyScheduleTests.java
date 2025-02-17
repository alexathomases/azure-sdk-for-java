// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.MonthlySchedule;
import org.junit.jupiter.api.Assertions;

public final class MonthlyScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonthlySchedule model = BinaryData.fromString(
            "{\"snapshotsToKeep\":306340067,\"daysOfMonth\":\"oakgtdlmkkzev\",\"hour\":973934778,\"minute\":1094584073,\"usedBytes\":9164175574248320213}")
            .toObject(MonthlySchedule.class);
        Assertions.assertEquals(306340067, model.snapshotsToKeep());
        Assertions.assertEquals("oakgtdlmkkzev", model.daysOfMonth());
        Assertions.assertEquals(973934778, model.hour());
        Assertions.assertEquals(1094584073, model.minute());
        Assertions.assertEquals(9164175574248320213L, model.usedBytes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonthlySchedule model = new MonthlySchedule().withSnapshotsToKeep(306340067)
            .withDaysOfMonth("oakgtdlmkkzev")
            .withHour(973934778)
            .withMinute(1094584073)
            .withUsedBytes(9164175574248320213L);
        model = BinaryData.fromObject(model).toObject(MonthlySchedule.class);
        Assertions.assertEquals(306340067, model.snapshotsToKeep());
        Assertions.assertEquals("oakgtdlmkkzev", model.daysOfMonth());
        Assertions.assertEquals(973934778, model.hour());
        Assertions.assertEquals(1094584073, model.minute());
        Assertions.assertEquals(9164175574248320213L, model.usedBytes());
    }
}
