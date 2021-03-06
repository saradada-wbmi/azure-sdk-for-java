/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a service principal identity for the cluster to use for
 * manipulating Azure APIs.
 */
public class ContainerServiceServicePrincipalProfile {
    /**
     * The ID for the service principal.
     */
    @JsonProperty(value = "clientId", required = true)
    private String clientId;

    /**
     * The secret password associated with the service principal.
     */
    @JsonProperty(value = "secret", required = true)
    private String secret;

    /**
     * Get the ID for the service principal.
     *
     * @return the clientId value
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the ID for the service principal.
     *
     * @param clientId the clientId value to set
     * @return the ContainerServiceServicePrincipalProfile object itself.
     */
    public ContainerServiceServicePrincipalProfile withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the secret password associated with the service principal.
     *
     * @return the secret value
     */
    public String secret() {
        return this.secret;
    }

    /**
     * Set the secret password associated with the service principal.
     *
     * @param secret the secret value to set
     * @return the ContainerServiceServicePrincipalProfile object itself.
     */
    public ContainerServiceServicePrincipalProfile withSecret(String secret) {
        this.secret = secret;
        return this;
    }

}
