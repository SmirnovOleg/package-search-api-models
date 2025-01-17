package org.jetbrains.packagesearch.api.v3.http

import kotlinx.serialization.Serializable
import org.jetbrains.packagesearch.api.v3.ApiPackage
import org.jetbrains.packagesearch.api.v3.ApiProject
import org.jetbrains.packagesearch.api.v3.search.PackagesType

@Serializable
public data class GetPackageInfoRequest(
    public val ids: Set<String> = emptySet(),
)

@Serializable
public data class SearchProjectRequest(
    public val query: String
)

@Serializable
public data class GetPackageInfoResponse(
    public val packages: List<ApiPackage> = emptyList()
)

@Serializable
public data class SearchPackagesRequest(
    public val packagesType: List<PackagesType> = emptyList(),
    public val searchQuery: String,
)

@Serializable
public data class SearchPackagesResponse(
    public val request: SearchPackagesRequest,
    public val packages: List<ApiPackage> = emptyList()
)

@Serializable
public data class SearchProjectResponse(
    public val request: SearchProjectRequest,
    public val projects: List<ApiProject>
)

@Serializable
public data class SearchProjectsResponse(
    public val query: Query,
    public val packages: List<ApiPackage> = emptyList()
) {
    @Serializable
    public data class Query(
        public val query: String,
        public val onlyStable: Boolean,
    )
}

@Serializable
public data class GetScmByUrlRequest(
    public val urls: List<String> = emptyList(),
)

@Serializable
public data class ProcessScmRequest(
    public val url: String,
    public val pkgIdHash: String,
)
