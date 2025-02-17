// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An IP rule.
 */
@Fluent
public final class IpRule implements JsonSerializable<IpRule> {
    /*
     * An IP or CIDR or ServiceTag
     */
    private String value;

    /*
     * Azure Networking ACL Action.
     */
    private AclAction action;

    /**
     * Creates an instance of IpRule class.
     */
    public IpRule() {
    }

    /**
     * Get the value property: An IP or CIDR or ServiceTag.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: An IP or CIDR or ServiceTag.
     * 
     * @param value the value value to set.
     * @return the IpRule object itself.
     */
    public IpRule withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the action property: Azure Networking ACL Action.
     * 
     * @return the action value.
     */
    public AclAction action() {
        return this.action;
    }

    /**
     * Set the action property: Azure Networking ACL Action.
     * 
     * @param action the action value to set.
     * @return the IpRule object itself.
     */
    public IpRule withAction(AclAction action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeStringField("action", this.action == null ? null : this.action.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpRule if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the IpRule.
     */
    public static IpRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpRule deserializedIpRule = new IpRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedIpRule.value = reader.getString();
                } else if ("action".equals(fieldName)) {
                    deserializedIpRule.action = AclAction.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpRule;
        });
    }
}
