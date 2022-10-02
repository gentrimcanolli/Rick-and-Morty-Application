package com.mirtneg.rickandmorty.data.models

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("info") val info : Info,
    @SerializedName("results") val results : List<Character>
)
