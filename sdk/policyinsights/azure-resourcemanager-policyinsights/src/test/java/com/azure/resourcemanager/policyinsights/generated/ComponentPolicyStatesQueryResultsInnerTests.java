// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.policyinsights.fluent.models.ComponentPolicyStatesQueryResultsInner;
import com.azure.resourcemanager.policyinsights.models.ComponentPolicyEvaluationDetails;
import com.azure.resourcemanager.policyinsights.models.ComponentPolicyState;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ComponentPolicyStatesQueryResultsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComponentPolicyStatesQueryResultsInner model = BinaryData.fromString(
            "{\"@odata.context\":\"njdxvglnkvxl\",\"@odata.count\":1233418998,\"value\":[{\"@odata.id\":\"ivbgkcv\",\"@odata.context\":\"pzvuqdflvo\",\"timestamp\":\"2021-11-22T18:46:16Z\",\"componentId\":\"fpubcpzgpxti\",\"componentType\":\"j\",\"componentName\":\"idibgqjxgpn\",\"resourceId\":\"govfgpikqmhhaow\",\"policyAssignmentId\":\"mzvupor\",\"policyDefinitionId\":\"dfuyd\",\"subscriptionId\":\"kfvxcnq\",\"resourceType\":\"qpswokmvkhlggdhb\",\"resourceLocation\":\"zqkzszuwi\",\"resourceGroup\":\"glxxhljfpgpic\",\"policyAssignmentName\":\"nzhrgmqgjsxvpqcb\",\"policyAssignmentOwner\":\"mbodthsqqgvri\",\"policyAssignmentParameters\":\"a\",\"policyAssignmentScope\":\"lacjfrnxo\",\"policyDefinitionName\":\"xauzlwvsgmwohqfz\",\"policyDefinitionAction\":\"vux\",\"policyDefinitionCategory\":\"kjsvthnwpzteko\",\"policySetDefinitionId\":\"ribi\",\"policySetDefinitionName\":\"tgplucfota\",\"policySetDefinitionOwner\":\"c\",\"policySetDefinitionCategory\":\"nykzcugswvxwlm\",\"policySetDefinitionParameters\":\"wmvtxnjm\",\"policyDefinitionReferenceId\":\"cuqudtcvclxy\",\"complianceState\":\"dkvgfabuiyjibuzp\",\"policyEvaluationDetails\":{\"evaluatedExpressions\":[{\"result\":\"eiknpgo\",\"expression\":\"jiuqhibtozi\",\"expressionKind\":\"wjedmurrxxgew\",\"path\":\"tvqylkmqpzoyhlfb\",\"expressionValue\":\"datawgcloxoebqinji\",\"targetValue\":\"datawjfuj\",\"operator\":\"afcba\"},{\"result\":\"pzpofoiyjw\",\"expression\":\"ilkmk\",\"expressionKind\":\"olvdnd\",\"path\":\"auo\",\"expressionValue\":\"datahuartv\",\"targetValue\":\"dataukyefchnmnahmnxh\",\"operator\":\"jqirwrw\"}],\"reason\":\"oxffif\"},\"policyDefinitionGroupNames\":[\"rsnewmozqvbubqma\",\"hsycxhxzgaz\",\"taboidvmf\",\"hppubowsepdfgkmt\"],\"policyDefinitionVersion\":\"erngbtcjuahokqto\",\"policySetDefinitionVersion\":\"auxofshfph\",\"policyAssignmentVersion\":\"nulaiywzejywhsl\",\"\":{\"fgf\":\"datajpllndnpdwrpq\",\"yetefyp\":\"datagsnnf\",\"fjgtixrjvzuy\":\"datacoc\",\"olbauirop\":\"dataurmlmuo\"}},{\"@odata.id\":\"nszonwpngaj\",\"@odata.context\":\"nixjawrtmjfjmy\",\"timestamp\":\"2021-04-05T08:29:20Z\",\"componentId\":\"zhcoxovnekhe\",\"componentType\":\"usfnr\",\"componentName\":\"jxtxrdc\",\"resourceId\":\"jvidttge\",\"policyAssignmentId\":\"slvyjtcvuwkasi\",\"policyDefinitionId\":\"esfuught\",\"subscriptionId\":\"fecjxeygtuhx\",\"resourceType\":\"cbuewmrswnjlxuz\",\"resourceLocation\":\"wpusxjbaqehg\",\"resourceGroup\":\"ohzjqatucoigeb\",\"policyAssignmentName\":\"cnwfepbnwgfmxjg\",\"policyAssignmentOwner\":\"bjb\",\"policyAssignmentParameters\":\"lfgtdysnaquflqbc\",\"policyAssignmentScope\":\"hamzjrwdkqze\",\"policyDefinitionName\":\"jleziunjx\",\"policyDefinitionAction\":\"zantkwceg\",\"policyDefinitionCategory\":\"mlbnseq\",\"policySetDefinitionId\":\"jjvpilguooqja\",\"policySetDefinitionName\":\"d\",\"policySetDefinitionOwner\":\"gueiookjbsahrtdt\",\"policySetDefinitionCategory\":\"elqacslmot\",\"policySetDefinitionParameters\":\"bnfxofvc\",\"policyDefinitionReferenceId\":\"gdirazf\",\"complianceState\":\"ejwabmdujtmvco\",\"policyEvaluationDetails\":{\"evaluatedExpressions\":[{\"result\":\"jurbuhhlkyqltqsr\",\"expression\":\"tuwkffdj\",\"expressionKind\":\"sysidfvclglxnf\",\"path\":\"jtkbusqogsfika\",\"expressionValue\":\"dataansharujtjiqxfz\",\"targetValue\":\"dataqttv\",\"operator\":\"pqhjpenuygbqeqq\"}],\"reason\":\"ewvnqvcdlgu\"},\"policyDefinitionGroupNames\":[\"mfdjwn\",\"axpunjqikczvv\",\"tacgxmfc\"],\"policyDefinitionVersion\":\"er\",\"policySetDefinitionVersion\":\"tvsoxhlwntsj\",\"policyAssignmentVersion\":\"rsxypruuu\",\"\":{\"oyuelyetn\":\"datachrszi\",\"qyggagfl\":\"datanb\",\"byrplrohkpig\":\"datalgmtrwahzjmucf\"}},{\"@odata.id\":\"usuckzmkwklsno\",\"@odata.context\":\"xmqeqalh\",\"timestamp\":\"2021-07-23T00:29:53Z\",\"componentId\":\"gwydyy\",\"componentType\":\"svkhgbv\",\"componentName\":\"anarfdlpukhpyrne\",\"resourceId\":\"jcpeogkhnmg\",\"policyAssignmentId\":\"ouxddbhfhpfpazj\",\"policyDefinitionId\":\"ywjxh\",\"subscriptionId\":\"ulontacnpqwteht\",\"resourceType\":\"vrh\",\"resourceLocation\":\"jyoogwxh\",\"resourceGroup\":\"duugwbsre\",\"policyAssignmentName\":\"fqkfuarenl\",\"policyAssignmentOwner\":\"htkln\",\"policyAssignmentParameters\":\"afvvk\",\"policyAssignmentScope\":\"edev\",\"policyDefinitionName\":\"oslc\",\"policyDefinitionAction\":\"y\",\"policyDefinitionCategory\":\"kkhminqcymczngn\",\"policySetDefinitionId\":\"xxewu\",\"policySetDefinitionName\":\"nvudbchaqdtvqecr\",\"policySetDefinitionOwner\":\"tmxxdtddmflhuy\",\"policySetDefinitionCategory\":\"zv\",\"policySetDefinitionParameters\":\"napxbannovv\",\"policyDefinitionReferenceId\":\"czytprwn\",\"complianceState\":\"roevyt\",\"policyEvaluationDetails\":{\"evaluatedExpressions\":[{\"result\":\"rrouuxvnsasbcry\",\"expression\":\"dizr\",\"expressionKind\":\"lobdxna\",\"path\":\"mkmlmvevfx\",\"expressionValue\":\"datapj\",\"targetValue\":\"datazxlioh\",\"operator\":\"dd\"},{\"result\":\"gxqbawpcb\",\"expression\":\"zqcyknap\",\"expressionKind\":\"fyuicdh\",\"path\":\"dyb\",\"expressionValue\":\"datagbdvibidmhmwff\",\"targetValue\":\"datafmuvapckccr\",\"operator\":\"weyoxoy\"}],\"reason\":\"k\"},\"policyDefinitionGroupNames\":[\"immoiroqboshbrag\",\"pyyrmfs\",\"bpav\"],\"policyDefinitionVersion\":\"pfppd\",\"policySetDefinitionVersion\":\"nupgahxku\",\"policyAssignmentVersion\":\"sjcaacfdmmcpugm\",\"\":{\"oqhnlb\":\"dataepvufhbzehew\",\"krsrrmoucs\":\"datanbldxeaclgschori\",\"abeolhbhlvbm\":\"datafldpuviyfc\"}}]}")
            .toObject(ComponentPolicyStatesQueryResultsInner.class);
        Assertions.assertEquals("oxffif", model.value().get(0).policyEvaluationDetails().reason());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComponentPolicyStatesQueryResultsInner model
            = new ComponentPolicyStatesQueryResultsInner().withValue(Arrays.asList(
                new ComponentPolicyState()
                    .withPolicyEvaluationDetails(new ComponentPolicyEvaluationDetails().withReason("oxffif"))
                    .withAdditionalProperties(mapOf("resourceGroup", "glxxhljfpgpic", "resourceId", "govfgpikqmhhaow",
                        "componentId", "fpubcpzgpxti", "policyDefinitionGroupNames",
                        JacksonAdapter.createDefaultSerializerAdapter()
                            .deserialize("[\"rsnewmozqvbubqma\",\"hsycxhxzgaz\",\"taboidvmf\",\"hppubowsepdfgkmt\"]",
                                Object.class, SerializerEncoding.JSON),
                        "policyDefinitionAction", "vux", "policyDefinitionCategory", "kjsvthnwpzteko",
                        "complianceState", "dkvgfabuiyjibuzp", "policySetDefinitionParameters", "wmvtxnjm", "@odata.id",
                        "ivbgkcv", "policyAssignmentScope", "lacjfrnxo", "policyAssignmentVersion", "nulaiywzejywhsl",
                        "componentName", "idibgqjxgpn", "timestamp", "2021-11-22T18:46:16Z", "componentType", "j",
                        "policySetDefinitionOwner", "c", "policyAssignmentOwner", "mbodthsqqgvri", "@odata.context",
                        "pzvuqdflvo", "resourceLocation", "zqkzszuwi", "policySetDefinitionId", "ribi",
                        "policySetDefinitionName", "tgplucfota", "policyDefinitionVersion", "erngbtcjuahokqto",
                        "policyDefinitionId", "dfuyd", "policySetDefinitionCategory", "nykzcugswvxwlm",
                        "policyDefinitionName", "xauzlwvsgmwohqfz", "policyDefinitionReferenceId", "cuqudtcvclxy",
                        "policyAssignmentName", "nzhrgmqgjsxvpqcb", "subscriptionId", "kfvxcnq",
                        "policySetDefinitionVersion", "auxofshfph", "policyAssignmentParameters", "a",
                        "policyAssignmentId", "mzvupor", "resourceType", "qpswokmvkhlggdhb")),
                new ComponentPolicyState()
                    .withPolicyEvaluationDetails(new ComponentPolicyEvaluationDetails().withReason("ewvnqvcdlgu"))
                    .withAdditionalProperties(mapOf("resourceGroup", "ohzjqatucoigeb", "resourceId", "jvidttge",
                        "componentId", "zhcoxovnekhe", "policyDefinitionGroupNames",
                        JacksonAdapter.createDefaultSerializerAdapter()
                            .deserialize("[\"mfdjwn\",\"axpunjqikczvv\",\"tacgxmfc\"]", Object.class,
                                SerializerEncoding.JSON),
                        "policyDefinitionAction", "zantkwceg", "policyDefinitionCategory", "mlbnseq", "complianceState",
                        "ejwabmdujtmvco", "policySetDefinitionParameters", "bnfxofvc", "@odata.id", "nszonwpngaj",
                        "policyAssignmentScope", "hamzjrwdkqze", "policyAssignmentVersion", "rsxypruuu",
                        "componentName", "jxtxrdc", "timestamp", "2021-04-05T08:29:20Z", "componentType", "usfnr",
                        "policySetDefinitionOwner", "gueiookjbsahrtdt", "policyAssignmentOwner", "bjb",
                        "@odata.context", "nixjawrtmjfjmy", "resourceLocation", "wpusxjbaqehg", "policySetDefinitionId",
                        "jjvpilguooqja", "policySetDefinitionName", "d", "policyDefinitionVersion", "er",
                        "policyDefinitionId", "esfuught", "policySetDefinitionCategory", "elqacslmot",
                        "policyDefinitionName", "jleziunjx", "policyDefinitionReferenceId", "gdirazf",
                        "policyAssignmentName", "cnwfepbnwgfmxjg", "subscriptionId", "fecjxeygtuhx",
                        "policySetDefinitionVersion", "tvsoxhlwntsj", "policyAssignmentParameters", "lfgtdysnaquflqbc",
                        "policyAssignmentId", "slvyjtcvuwkasi", "resourceType", "cbuewmrswnjlxuz")),
                new ComponentPolicyState()
                    .withPolicyEvaluationDetails(new ComponentPolicyEvaluationDetails().withReason("k"))
                    .withAdditionalProperties(mapOf("resourceGroup", "duugwbsre", "resourceId", "jcpeogkhnmg",
                        "componentId", "gwydyy", "policyDefinitionGroupNames",
                        JacksonAdapter.createDefaultSerializerAdapter()
                            .deserialize("[\"immoiroqboshbrag\",\"pyyrmfs\",\"bpav\"]", Object.class,
                                SerializerEncoding.JSON),
                        "policyDefinitionAction", "y", "policyDefinitionCategory", "kkhminqcymczngn", "complianceState",
                        "roevyt", "policySetDefinitionParameters", "napxbannovv", "@odata.id", "usuckzmkwklsno",
                        "policyAssignmentScope", "edev", "policyAssignmentVersion", "sjcaacfdmmcpugm", "componentName",
                        "anarfdlpukhpyrne", "timestamp", "2021-07-23T00:29:53Z", "componentType", "svkhgbv",
                        "policySetDefinitionOwner", "tmxxdtddmflhuy", "policyAssignmentOwner", "htkln",
                        "@odata.context", "xmqeqalh", "resourceLocation", "jyoogwxh", "policySetDefinitionId", "xxewu",
                        "policySetDefinitionName", "nvudbchaqdtvqecr", "policyDefinitionVersion", "pfppd",
                        "policyDefinitionId", "ywjxh", "policySetDefinitionCategory", "zv", "policyDefinitionName",
                        "oslc", "policyDefinitionReferenceId", "czytprwn", "policyAssignmentName", "fqkfuarenl",
                        "subscriptionId", "ulontacnpqwteht", "policySetDefinitionVersion", "nupgahxku",
                        "policyAssignmentParameters", "afvvk", "policyAssignmentId", "ouxddbhfhpfpazj", "resourceType",
                        "vrh"))));
        model = BinaryData.fromObject(model).toObject(ComponentPolicyStatesQueryResultsInner.class);
        Assertions.assertEquals("oxffif", model.value().get(0).policyEvaluationDetails().reason());
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
