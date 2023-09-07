package es.rudo.proyectodesdecero.data.models

import com.google.gson.annotations.SerializedName

data class CharacterApiModel(
    @SerializedName("_id")
    val id: Int? = null,
    val films: List<String>? = null,
    val name: String? = null,
    val imageUrl: String? = null,
)
