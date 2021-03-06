/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01.implementation;

import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationLockLevel;
import java.util.List;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationAuthorization;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationDefinitionArtifact;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationNotificationPolicy;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationPackageLockingPolicyDefinition;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationDeploymentPolicy;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationManagementPolicy;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.managedapplications.v2019_07_01.GenericResource;

/**
 * Information about managed application definition.
 */
@JsonFlatten
public class ApplicationDefinitionInner extends GenericResource {
    /**
     * The managed application lock level. Possible values include:
     * 'CanNotDelete', 'ReadOnly', 'None'.
     */
    @JsonProperty(value = "properties.lockLevel", required = true)
    private ApplicationLockLevel lockLevel;

    /**
     * The managed application definition display name.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * A value indicating whether the package is enabled or not.
     */
    @JsonProperty(value = "properties.isEnabled")
    private Boolean isEnabled;

    /**
     * The managed application provider authorizations.
     */
    @JsonProperty(value = "properties.authorizations")
    private List<ApplicationAuthorization> authorizations;

    /**
     * The collection of managed application artifacts. The portal will use the
     * files specified as artifacts to construct the user experience of
     * creating a managed application from a managed application definition.
     */
    @JsonProperty(value = "properties.artifacts")
    private List<ApplicationDefinitionArtifact> artifacts;

    /**
     * The managed application definition description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The managed application definition package file Uri. Use this element.
     */
    @JsonProperty(value = "properties.packageFileUri")
    private String packageFileUri;

    /**
     * The inline main template json which has resources to be provisioned. It
     * can be a JObject or well-formed JSON string.
     */
    @JsonProperty(value = "properties.mainTemplate")
    private Object mainTemplate;

    /**
     * The createUiDefinition json for the backing template with
     * Microsoft.Solutions/applications resource. It can be a JObject or
     * well-formed JSON string.
     */
    @JsonProperty(value = "properties.createUiDefinition")
    private Object createUiDefinition;

    /**
     * The managed application notification policy.
     */
    @JsonProperty(value = "properties.notificationPolicy")
    private ApplicationNotificationPolicy notificationPolicy;

    /**
     * The managed application locking policy.
     */
    @JsonProperty(value = "properties.lockingPolicy")
    private ApplicationPackageLockingPolicyDefinition lockingPolicy;

    /**
     * The managed application deployment policy.
     */
    @JsonProperty(value = "properties.deploymentPolicy")
    private ApplicationDeploymentPolicy deploymentPolicy;

    /**
     * The managed application management policy that determines publisher's
     * access to the managed resource group.
     */
    @JsonProperty(value = "properties.managementPolicy")
    private ApplicationManagementPolicy managementPolicy;

    /**
     * The managed application provider policies.
     */
    @JsonProperty(value = "properties.policies")
    private List<ApplicationPolicy> policies;

    /**
     * Get the managed application lock level. Possible values include: 'CanNotDelete', 'ReadOnly', 'None'.
     *
     * @return the lockLevel value
     */
    public ApplicationLockLevel lockLevel() {
        return this.lockLevel;
    }

    /**
     * Set the managed application lock level. Possible values include: 'CanNotDelete', 'ReadOnly', 'None'.
     *
     * @param lockLevel the lockLevel value to set
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withLockLevel(ApplicationLockLevel lockLevel) {
        this.lockLevel = lockLevel;
        return this;
    }

    /**
     * Get the managed application definition display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the managed application definition display name.
     *
     * @param displayName the displayName value to set
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get a value indicating whether the package is enabled or not.
     *
     * @return the isEnabled value
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set a value indicating whether the package is enabled or not.
     *
     * @param isEnabled the isEnabled value to set
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the managed application provider authorizations.
     *
     * @return the authorizations value
     */
    public List<ApplicationAuthorization> authorizations() {
        return this.authorizations;
    }

    /**
     * Set the managed application provider authorizations.
     *
     * @param authorizations the authorizations value to set
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withAuthorizations(List<ApplicationAuthorization> authorizations) {
        this.authorizations = authorizations;
        return this;
    }

    /**
     * Get the collection of managed application artifacts. The portal will use the files specified as artifacts to construct the user experience of creating a managed application from a managed application definition.
     *
     * @return the artifacts value
     */
    public List<ApplicationDefinitionArtifact> artifacts() {
        return this.artifacts;
    }

    /**
     * Set the collection of managed application artifacts. The portal will use the files specified as artifacts to construct the user experience of creating a managed application from a managed application definition.
     *
     * @param artifacts the artifacts value to set
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withArtifacts(List<ApplicationDefinitionArtifact> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    /**
     * Get the managed application definition description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the managed application definition description.
     *
     * @param description the description value to set
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the managed application definition package file Uri. Use this element.
     *
     * @return the packageFileUri value
     */
    public String packageFileUri() {
        return this.packageFileUri;
    }

    /**
     * Set the managed application definition package file Uri. Use this element.
     *
     * @param packageFileUri the packageFileUri value to set
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withPackageFileUri(String packageFileUri) {
        this.packageFileUri = packageFileUri;
        return this;
    }

    /**
     * Get the inline main template json which has resources to be provisioned. It can be a JObject or well-formed JSON string.
     *
     * @return the mainTemplate value
     */
    public Object mainTemplate() {
        return this.mainTemplate;
    }

    /**
     * Set the inline main template json which has resources to be provisioned. It can be a JObject or well-formed JSON string.
     *
     * @param mainTemplate the mainTemplate value to set
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withMainTemplate(Object mainTemplate) {
        this.mainTemplate = mainTemplate;
        return this;
    }

    /**
     * Get the createUiDefinition json for the backing template with Microsoft.Solutions/applications resource. It can be a JObject or well-formed JSON string.
     *
     * @return the createUiDefinition value
     */
    public Object createUiDefinition() {
        return this.createUiDefinition;
    }

    /**
     * Set the createUiDefinition json for the backing template with Microsoft.Solutions/applications resource. It can be a JObject or well-formed JSON string.
     *
     * @param createUiDefinition the createUiDefinition value to set
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withCreateUiDefinition(Object createUiDefinition) {
        this.createUiDefinition = createUiDefinition;
        return this;
    }

    /**
     * Get the managed application notification policy.
     *
     * @return the notificationPolicy value
     */
    public ApplicationNotificationPolicy notificationPolicy() {
        return this.notificationPolicy;
    }

    /**
     * Set the managed application notification policy.
     *
     * @param notificationPolicy the notificationPolicy value to set
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withNotificationPolicy(ApplicationNotificationPolicy notificationPolicy) {
        this.notificationPolicy = notificationPolicy;
        return this;
    }

    /**
     * Get the managed application locking policy.
     *
     * @return the lockingPolicy value
     */
    public ApplicationPackageLockingPolicyDefinition lockingPolicy() {
        return this.lockingPolicy;
    }

    /**
     * Set the managed application locking policy.
     *
     * @param lockingPolicy the lockingPolicy value to set
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withLockingPolicy(ApplicationPackageLockingPolicyDefinition lockingPolicy) {
        this.lockingPolicy = lockingPolicy;
        return this;
    }

    /**
     * Get the managed application deployment policy.
     *
     * @return the deploymentPolicy value
     */
    public ApplicationDeploymentPolicy deploymentPolicy() {
        return this.deploymentPolicy;
    }

    /**
     * Set the managed application deployment policy.
     *
     * @param deploymentPolicy the deploymentPolicy value to set
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withDeploymentPolicy(ApplicationDeploymentPolicy deploymentPolicy) {
        this.deploymentPolicy = deploymentPolicy;
        return this;
    }

    /**
     * Get the managed application management policy that determines publisher's access to the managed resource group.
     *
     * @return the managementPolicy value
     */
    public ApplicationManagementPolicy managementPolicy() {
        return this.managementPolicy;
    }

    /**
     * Set the managed application management policy that determines publisher's access to the managed resource group.
     *
     * @param managementPolicy the managementPolicy value to set
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withManagementPolicy(ApplicationManagementPolicy managementPolicy) {
        this.managementPolicy = managementPolicy;
        return this;
    }

    /**
     * Get the managed application provider policies.
     *
     * @return the policies value
     */
    public List<ApplicationPolicy> policies() {
        return this.policies;
    }

    /**
     * Set the managed application provider policies.
     *
     * @param policies the policies value to set
     * @return the ApplicationDefinitionInner object itself.
     */
    public ApplicationDefinitionInner withPolicies(List<ApplicationPolicy> policies) {
        this.policies = policies;
        return this;
    }

}
