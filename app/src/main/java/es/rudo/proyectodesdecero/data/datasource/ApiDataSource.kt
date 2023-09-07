package es.rudo.proyectodesdecero.data.datasource

import es.rudo.proyectodesdecero.data.models.CharacterApiModel

interface ApiDataSource {

    fun getCharacters(): List<CharacterApiModel>
}
