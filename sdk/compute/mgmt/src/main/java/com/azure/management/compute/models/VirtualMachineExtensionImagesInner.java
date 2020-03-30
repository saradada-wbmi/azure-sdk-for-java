// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * VirtualMachineExtensionImages.
 */
public final class VirtualMachineExtensionImagesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private VirtualMachineExtensionImagesService service;

    /**
     * The service client containing this operation class.
     */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineExtensionImagesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineExtensionImagesInner(ComputeManagementClientImpl client) {
        this.service = RestProxy.create(VirtualMachineExtensionImagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * ComputeManagementClientVirtualMachineExtensionImages to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementClientVirtualMachineExtensionImages")
    private interface VirtualMachineExtensionImagesService {
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmextension/types/{type}/versions/{version}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualMachineExtensionImageInner>> get(@HostParam("$host") String host, @PathParam("location") String location, @PathParam("publisherName") String publisherName, @PathParam("type") String type, @PathParam("version") String version, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmextension/types")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<List<VirtualMachineExtensionImageInner>>> listTypes(@HostParam("$host") String host, @PathParam("location") String location, @PathParam("publisherName") String publisherName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmextension/types/{type}/versions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<List<VirtualMachineExtensionImageInner>>> listVersions(@HostParam("$host") String host, @PathParam("location") String location, @PathParam("publisherName") String publisherName, @PathParam("type") String type, @QueryParam("$filter") String filter, @QueryParam("$top") Integer top, @QueryParam("$orderby") String orderby, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Gets a virtual machine extension image.
     * 
     * @param location 
     * @param publisherName 
     * @param type 
     * @param version 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualMachineExtensionImageInner>> getWithResponseAsync(String location, String publisherName, String type, String version) {
        final String apiVersion = "2019-03-01";
        return service.get(this.client.getHost(), location, publisherName, type, version, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a virtual machine extension image.
     * 
     * @param location 
     * @param publisherName 
     * @param type 
     * @param version 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualMachineExtensionImageInner> getAsync(String location, String publisherName, String type, String version) {
        return getWithResponseAsync(location, publisherName, type, version)
            .flatMap((SimpleResponse<VirtualMachineExtensionImageInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a virtual machine extension image.
     * 
     * @param location 
     * @param publisherName 
     * @param type 
     * @param version 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineExtensionImageInner get(String location, String publisherName, String type, String version) {
        return getAsync(location, publisherName, type, version).block();
    }

    /**
     * Gets a list of virtual machine extension image types.
     * 
     * @param location 
     * @param publisherName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<List<VirtualMachineExtensionImageInner>>> listTypesWithResponseAsync(String location, String publisherName) {
        final String apiVersion = "2019-03-01";
        return service.listTypes(this.client.getHost(), location, publisherName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a list of virtual machine extension image types.
     * 
     * @param location 
     * @param publisherName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<VirtualMachineExtensionImageInner>> listTypesAsync(String location, String publisherName) {
        return listTypesWithResponseAsync(location, publisherName)
            .flatMap((SimpleResponse<List<VirtualMachineExtensionImageInner>> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a list of virtual machine extension image types.
     * 
     * @param location 
     * @param publisherName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<VirtualMachineExtensionImageInner> listTypes(String location, String publisherName) {
        return listTypesAsync(location, publisherName).block();
    }

    /**
     * Gets a list of virtual machine extension image versions.
     * 
     * @param location 
     * @param publisherName 
     * @param type 
     * @param filter 
     * @param top 
     * @param orderby 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<List<VirtualMachineExtensionImageInner>>> listVersionsWithResponseAsync(String location, String publisherName, String type, String filter, Integer top, String orderby) {
        final String apiVersion = "2019-03-01";
        return service.listVersions(this.client.getHost(), location, publisherName, type, filter, top, orderby, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a list of virtual machine extension image versions.
     * 
     * @param location 
     * @param publisherName 
     * @param type 
     * @param filter 
     * @param top 
     * @param orderby 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<VirtualMachineExtensionImageInner>> listVersionsAsync(String location, String publisherName, String type, String filter, Integer top, String orderby) {
        return listVersionsWithResponseAsync(location, publisherName, type, filter, top, orderby)
            .flatMap((SimpleResponse<List<VirtualMachineExtensionImageInner>> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a list of virtual machine extension image versions.
     * 
     * @param location 
     * @param publisherName 
     * @param type 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<VirtualMachineExtensionImageInner>> listVersionsAsync(String location, String publisherName, String type) {
        final String filter = null;
        final Integer top = null;
        final String orderby = null;
        final String apiVersion = "2019-03-01";
        return listVersionsWithResponseAsync(location, publisherName, type, filter, top, orderby)
            .flatMap((SimpleResponse<List<VirtualMachineExtensionImageInner>> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a list of virtual machine extension image versions.
     * 
     * @param location 
     * @param publisherName 
     * @param type 
     * @param filter 
     * @param top 
     * @param orderby 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<VirtualMachineExtensionImageInner> listVersions(String location, String publisherName, String type, String filter, Integer top, String orderby) {
        return listVersionsAsync(location, publisherName, type, filter, top, orderby).block();
    }

    /**
     * Gets a list of virtual machine extension image versions.
     * 
     * @param location 
     * @param publisherName 
     * @param type 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<VirtualMachineExtensionImageInner> listVersions(String location, String publisherName, String type) {
        final String filter = null;
        final Integer top = null;
        final String orderby = null;
        final String apiVersion = "2019-03-01";
        return listVersionsAsync(location, publisherName, type, filter, top, orderby).block();
    }
}