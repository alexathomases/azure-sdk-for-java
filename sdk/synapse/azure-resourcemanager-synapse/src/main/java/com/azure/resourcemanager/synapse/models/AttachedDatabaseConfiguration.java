// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.AttachedDatabaseConfigurationInner;
import java.util.List;

/**
 * An immutable client-side representation of AttachedDatabaseConfiguration.
 */
public interface AttachedDatabaseConfiguration {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: Resource location.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioned state of the resource.
     * 
     * @return the provisioningState value.
     */
    ResourceProvisioningState provisioningState();

    /**
     * Gets the databaseName property: The name of the database which you would like to attach, use * if you want to
     * follow all current and future databases.
     * 
     * @return the databaseName value.
     */
    String databaseName();

    /**
     * Gets the kustoPoolResourceId property: The resource id of the kusto pool where the databases you would like to
     * attach reside.
     * 
     * @return the kustoPoolResourceId value.
     */
    String kustoPoolResourceId();

    /**
     * Gets the attachedDatabaseNames property: The list of databases from the clusterResourceId which are currently
     * attached to the kusto pool.
     * 
     * @return the attachedDatabaseNames value.
     */
    List<String> attachedDatabaseNames();

    /**
     * Gets the defaultPrincipalsModificationKind property: The default principals modification kind.
     * 
     * @return the defaultPrincipalsModificationKind value.
     */
    DefaultPrincipalsModificationKind defaultPrincipalsModificationKind();

    /**
     * Gets the tableLevelSharingProperties property: Table level sharing specifications.
     * 
     * @return the tableLevelSharingProperties value.
     */
    TableLevelSharingProperties tableLevelSharingProperties();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.AttachedDatabaseConfigurationInner object.
     * 
     * @return the inner object.
     */
    AttachedDatabaseConfigurationInner innerModel();

    /**
     * The entirety of the AttachedDatabaseConfiguration definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The AttachedDatabaseConfiguration definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the AttachedDatabaseConfiguration definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the AttachedDatabaseConfiguration definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies workspaceName, kustoPoolName, resourceGroupName.
             * 
             * @param workspaceName The name of the workspace.
             * @param kustoPoolName The name of the Kusto pool.
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingKustoPool(String workspaceName, String kustoPoolName, String resourceGroupName);
        }

        /**
         * The stage of the AttachedDatabaseConfiguration definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithLocation, DefinitionStages.WithDatabaseName,
            DefinitionStages.WithKustoPoolResourceId, DefinitionStages.WithDefaultPrincipalsModificationKind,
            DefinitionStages.WithTableLevelSharingProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            AttachedDatabaseConfiguration create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AttachedDatabaseConfiguration create(Context context);
        }

        /**
         * The stage of the AttachedDatabaseConfiguration definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location Resource location.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location Resource location.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }

        /**
         * The stage of the AttachedDatabaseConfiguration definition allowing to specify databaseName.
         */
        interface WithDatabaseName {
            /**
             * Specifies the databaseName property: The name of the database which you would like to attach, use * if
             * you want to follow all current and future databases..
             * 
             * @param databaseName The name of the database which you would like to attach, use * if you want to follow
             * all current and future databases.
             * @return the next definition stage.
             */
            WithCreate withDatabaseName(String databaseName);
        }

        /**
         * The stage of the AttachedDatabaseConfiguration definition allowing to specify kustoPoolResourceId.
         */
        interface WithKustoPoolResourceId {
            /**
             * Specifies the kustoPoolResourceId property: The resource id of the kusto pool where the databases you
             * would like to attach reside..
             * 
             * @param kustoPoolResourceId The resource id of the kusto pool where the databases you would like to attach
             * reside.
             * @return the next definition stage.
             */
            WithCreate withKustoPoolResourceId(String kustoPoolResourceId);
        }

        /**
         * The stage of the AttachedDatabaseConfiguration definition allowing to specify
         * defaultPrincipalsModificationKind.
         */
        interface WithDefaultPrincipalsModificationKind {
            /**
             * Specifies the defaultPrincipalsModificationKind property: The default principals modification kind.
             * 
             * @param defaultPrincipalsModificationKind The default principals modification kind.
             * @return the next definition stage.
             */
            WithCreate withDefaultPrincipalsModificationKind(
                DefaultPrincipalsModificationKind defaultPrincipalsModificationKind);
        }

        /**
         * The stage of the AttachedDatabaseConfiguration definition allowing to specify tableLevelSharingProperties.
         */
        interface WithTableLevelSharingProperties {
            /**
             * Specifies the tableLevelSharingProperties property: Table level sharing specifications.
             * 
             * @param tableLevelSharingProperties Table level sharing specifications.
             * @return the next definition stage.
             */
            WithCreate withTableLevelSharingProperties(TableLevelSharingProperties tableLevelSharingProperties);
        }
    }

    /**
     * Begins update for the AttachedDatabaseConfiguration resource.
     * 
     * @return the stage of resource update.
     */
    AttachedDatabaseConfiguration.Update update();

    /**
     * The template for AttachedDatabaseConfiguration update.
     */
    interface Update extends UpdateStages.WithDatabaseName, UpdateStages.WithKustoPoolResourceId,
        UpdateStages.WithDefaultPrincipalsModificationKind, UpdateStages.WithTableLevelSharingProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        AttachedDatabaseConfiguration apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AttachedDatabaseConfiguration apply(Context context);
    }

    /**
     * The AttachedDatabaseConfiguration update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the AttachedDatabaseConfiguration update allowing to specify databaseName.
         */
        interface WithDatabaseName {
            /**
             * Specifies the databaseName property: The name of the database which you would like to attach, use * if
             * you want to follow all current and future databases..
             * 
             * @param databaseName The name of the database which you would like to attach, use * if you want to follow
             * all current and future databases.
             * @return the next definition stage.
             */
            Update withDatabaseName(String databaseName);
        }

        /**
         * The stage of the AttachedDatabaseConfiguration update allowing to specify kustoPoolResourceId.
         */
        interface WithKustoPoolResourceId {
            /**
             * Specifies the kustoPoolResourceId property: The resource id of the kusto pool where the databases you
             * would like to attach reside..
             * 
             * @param kustoPoolResourceId The resource id of the kusto pool where the databases you would like to attach
             * reside.
             * @return the next definition stage.
             */
            Update withKustoPoolResourceId(String kustoPoolResourceId);
        }

        /**
         * The stage of the AttachedDatabaseConfiguration update allowing to specify defaultPrincipalsModificationKind.
         */
        interface WithDefaultPrincipalsModificationKind {
            /**
             * Specifies the defaultPrincipalsModificationKind property: The default principals modification kind.
             * 
             * @param defaultPrincipalsModificationKind The default principals modification kind.
             * @return the next definition stage.
             */
            Update withDefaultPrincipalsModificationKind(
                DefaultPrincipalsModificationKind defaultPrincipalsModificationKind);
        }

        /**
         * The stage of the AttachedDatabaseConfiguration update allowing to specify tableLevelSharingProperties.
         */
        interface WithTableLevelSharingProperties {
            /**
             * Specifies the tableLevelSharingProperties property: Table level sharing specifications.
             * 
             * @param tableLevelSharingProperties Table level sharing specifications.
             * @return the next definition stage.
             */
            Update withTableLevelSharingProperties(TableLevelSharingProperties tableLevelSharingProperties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    AttachedDatabaseConfiguration refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AttachedDatabaseConfiguration refresh(Context context);
}
