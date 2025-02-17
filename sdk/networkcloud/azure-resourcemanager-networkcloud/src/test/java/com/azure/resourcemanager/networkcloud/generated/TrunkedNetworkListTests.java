// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.TrunkedNetworkInner;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.TrunkedNetworkList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TrunkedNetworkListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TrunkedNetworkList model = BinaryData.fromString(
            "{\"nextLink\":\"aimlnwiaaom\",\"value\":[{\"extendedLocation\":{\"name\":\"eazulcs\",\"type\":\"thwwn\"},\"properties\":{\"associatedResourceIds\":[\"l\"],\"clusterId\":\"swpchwahfbousn\",\"detailedStatus\":\"Available\",\"detailedStatusMessage\":\"fewetwlyxgncx\",\"hybridAksClustersAssociatedIds\":[\"hdjhlimmbcx\",\"h\"],\"hybridAksPluginType\":\"OSDevice\",\"interfaceName\":\"rxvxcjzh\",\"isolationDomainIds\":[\"zxfpxtgqsc\",\"avft\"],\"provisioningState\":\"Canceled\",\"virtualMachinesAssociatedIds\":[\"azkmtgguwp\"],\"vlans\":[767059263997452674,7517246226041881019]},\"location\":\"vmmghfcfiwrxgk\",\"tags\":{\"zqodfvpgshox\":\"vyi\",\"zflbqvg\":\"sgbpfgzdjtx\",\"sdtutnwlduyc\":\"qvlgafcqusrdvetn\",\"kuqgsjjxundxgket\":\"uzhyrmewipmvekdx\"},\"id\":\"zhhzjhfjmhvvmu\",\"name\":\"gpmuneqsxvmhfbuz\",\"type\":\"yihsasbhudypohyu\"},{\"extendedLocation\":{\"name\":\"ms\",\"type\":\"ynsqyrpfoobr\"},\"properties\":{\"associatedResourceIds\":[\"y\"],\"clusterId\":\"jnygq\",\"detailedStatus\":\"Available\",\"detailedStatusMessage\":\"qzdz\",\"hybridAksClustersAssociatedIds\":[\"la\",\"hnfhqlyvijouwi\"],\"hybridAksPluginType\":\"OSDevice\",\"interfaceName\":\"yzunbixxrtikv\",\"isolationDomainIds\":[\"wpgclrcivt\",\"oxfrkenxpmyyefr\",\"mpdnqqskawa\"],\"provisioningState\":\"Provisioning\",\"virtualMachinesAssociatedIds\":[\"bnpqfrtqlkzme\",\"nitgvkxlz\"],\"vlans\":[3259590014708036910,6287019732891771770,642502013923819576,8171214397183496400]},\"location\":\"zxwhcansymoyqhlw\",\"tags\":{\"wasqvdaeyyg\":\"ivbkbxgomfaj\"},\"id\":\"xakjsqzhzb\",\"name\":\"zkgimsid\",\"type\":\"asi\"}]}")
            .toObject(TrunkedNetworkList.class);
        Assertions.assertEquals("aimlnwiaaom", model.nextLink());
        Assertions.assertEquals("vmmghfcfiwrxgk", model.value().get(0).location());
        Assertions.assertEquals("vyi", model.value().get(0).tags().get("zqodfvpgshox"));
        Assertions.assertEquals("eazulcs", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("thwwn", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals(HybridAksPluginType.OSDEVICE, model.value().get(0).hybridAksPluginType());
        Assertions.assertEquals("rxvxcjzh", model.value().get(0).interfaceName());
        Assertions.assertEquals("zxfpxtgqsc", model.value().get(0).isolationDomainIds().get(0));
        Assertions.assertEquals(767059263997452674L, model.value().get(0).vlans().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TrunkedNetworkList model = new TrunkedNetworkList().withNextLink("aimlnwiaaom")
            .withValue(Arrays.asList(
                new TrunkedNetworkInner().withLocation("vmmghfcfiwrxgk")
                    .withTags(mapOf("zqodfvpgshox", "vyi", "zflbqvg", "sgbpfgzdjtx", "sdtutnwlduyc", "qvlgafcqusrdvetn",
                        "kuqgsjjxundxgket", "uzhyrmewipmvekdx"))
                    .withExtendedLocation(new ExtendedLocation().withName("eazulcs").withType("thwwn"))
                    .withHybridAksPluginType(HybridAksPluginType.OSDEVICE)
                    .withInterfaceName("rxvxcjzh")
                    .withIsolationDomainIds(Arrays.asList("zxfpxtgqsc", "avft"))
                    .withVlans(Arrays.asList(767059263997452674L, 7517246226041881019L)),
                new TrunkedNetworkInner().withLocation("zxwhcansymoyqhlw")
                    .withTags(mapOf("wasqvdaeyyg", "ivbkbxgomfaj"))
                    .withExtendedLocation(new ExtendedLocation().withName("ms").withType("ynsqyrpfoobr"))
                    .withHybridAksPluginType(HybridAksPluginType.OSDEVICE)
                    .withInterfaceName("yzunbixxrtikv")
                    .withIsolationDomainIds(Arrays.asList("wpgclrcivt", "oxfrkenxpmyyefr", "mpdnqqskawa"))
                    .withVlans(Arrays.asList(3259590014708036910L, 6287019732891771770L, 642502013923819576L,
                        8171214397183496400L))));
        model = BinaryData.fromObject(model).toObject(TrunkedNetworkList.class);
        Assertions.assertEquals("aimlnwiaaom", model.nextLink());
        Assertions.assertEquals("vmmghfcfiwrxgk", model.value().get(0).location());
        Assertions.assertEquals("vyi", model.value().get(0).tags().get("zqodfvpgshox"));
        Assertions.assertEquals("eazulcs", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("thwwn", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals(HybridAksPluginType.OSDEVICE, model.value().get(0).hybridAksPluginType());
        Assertions.assertEquals("rxvxcjzh", model.value().get(0).interfaceName());
        Assertions.assertEquals("zxfpxtgqsc", model.value().get(0).isolationDomainIds().get(0));
        Assertions.assertEquals(767059263997452674L, model.value().get(0).vlans().get(0));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
