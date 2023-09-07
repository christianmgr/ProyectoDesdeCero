package es.rudo.proyectodesdecero.data.remote.api

import es.rudo.proyectodesdecero.data.models.CharacterApiModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiDisney {

    // TODO Change result
    @GET("character")
    fun getCharacters(): Response<List<CharacterApiModel>>
}
