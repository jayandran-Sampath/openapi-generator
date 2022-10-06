package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Category
import org.openapitools.model.Tag
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * A pet for sale in the pet store
 * @param name 
 * @param photoUrls 
 * @param id 
 * @param category 
 * @param tags 
 * @param status pet status in the store
 */
data class Pet(

    @Schema(example = "doggie", required = true, description = "")
    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @field:JsonProperty("photoUrls", required = true) val photoUrls: kotlin.collections.List<kotlin.String>,

    @Schema(example = "null", description = "")
    @field:JsonProperty("id") val id: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @field:JsonProperty("category") val category: Category? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @field:JsonProperty("tags") val tags: kotlin.collections.List<Tag>? = null,

    @Schema(example = "null", description = "pet status in the store")
    @Deprecated(message = "")
    @field:JsonProperty("status") val status: Pet.Status? = null
) {

    /**
    * pet status in the store
    * Values: available,pending,sold
    */
    enum class Status(val value: kotlin.String) {

        @JsonProperty("available") available("available"),
        @JsonProperty("pending") pending("pending"),
        @JsonProperty("sold") sold("sold")
    }

}

