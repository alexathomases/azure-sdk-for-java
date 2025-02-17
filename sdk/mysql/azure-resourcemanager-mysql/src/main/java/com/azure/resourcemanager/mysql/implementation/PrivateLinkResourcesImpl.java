// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.mysql.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.mysql.models.PrivateLinkResource;
import com.azure.resourcemanager.mysql.models.PrivateLinkResources;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(PrivateLinkResourcesImpl.class);

    private final PrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.mysql.MySqlManager serviceManager;

    public PrivateLinkResourcesImpl(PrivateLinkResourcesClient innerClient,
        com.azure.resourcemanager.mysql.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateLinkResource> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<PrivateLinkResourceInner> inner
            = this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkResource> listByServer(String resourceGroupName, String serverName,
        Context context) {
        PagedIterable<PrivateLinkResourceInner> inner
            = this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PrivateLinkResource get(String resourceGroupName, String serverName, String groupName) {
        PrivateLinkResourceInner inner = this.serviceClient().get(resourceGroupName, serverName, groupName);
        if (inner != null) {
            return new PrivateLinkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResource> getWithResponse(String resourceGroupName, String serverName, String groupName,
        Context context) {
        Response<PrivateLinkResourceInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, serverName, groupName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrivateLinkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysql.MySqlManager manager() {
        return this.serviceManager;
    }
}
