package com.iker

import com.fasterxml.jackson.annotation.JsonProperty

data class Data(
    @JsonProperty("types") val types: List<Type> = emptyList(),
    @JsonProperty("pokemon") val pokemon: List<Pokemon> = emptyList()
)

data class Type(
    @JsonProperty("name") val name: String = "",
    @JsonProperty("descrip") val descrip: String = "",
    @JsonProperty("img") val img: String = ""
)

data class Pokemon(
    @JsonProperty("type") val type: String = "",
    @JsonProperty("name") val name: String = "",
    @JsonProperty("pokedex") val pokedex: Int = 0
)


