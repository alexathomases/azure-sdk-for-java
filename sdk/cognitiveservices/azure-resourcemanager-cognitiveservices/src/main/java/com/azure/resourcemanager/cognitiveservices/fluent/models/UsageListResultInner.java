// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The response to a list usage request.
 */
@Fluent
public final class UsageListResultInner implements JsonSerializable<UsageListResultInner> {
    /*
     * The link used to get the next page of Usages.
     */
    private String nextLink;

    /*
     * The list of usages for Cognitive Service account.
     */
    private List<UsageInner> value;

    /**
     * Creates an instance of UsageListResultInner class.
     */
    public UsageListResultInner() {
    }

    /**
     * Get the nextLink property: The link used to get the next page of Usages.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of Usages.
     * 
     * @param nextLink the nextLink value to set.
     * @return the UsageListResultInner object itself.
     */
    public UsageListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: The list of usages for Cognitive Service account.
     * 
     * @return the value value.
     */
    public List<UsageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of usages for Cognitive Service account.
     * 
     * @param value the value value to set.
     * @return the UsageListResultInner object itself.
     */
    public UsageListResultInner withValue(List<UsageInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("nextLink", this.nextLink);
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UsageListResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UsageListResultInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UsageListResultInner.
     */
    public static UsageListResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UsageListResultInner deserializedUsageListResultInner = new UsageListResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nextLink".equals(fieldName)) {
                    deserializedUsageListResultInner.nextLink = reader.getString();
                } else if ("value".equals(fieldName)) {
                    List<UsageInner> value = reader.readArray(reader1 -> UsageInner.fromJson(reader1));
                    deserializedUsageListResultInner.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUsageListResultInner;
        });
    }
}
