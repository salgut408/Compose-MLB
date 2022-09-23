package com.sgut.android.artcomposeapp

import com.google.gson.annotations.SerializedName


data class GamesListResponse (

  @SerializedName("copyright"            ) var copyright            : String?          = null,
  @SerializedName("totalItems"           ) var totalItems           : Int?             = null,
  @SerializedName("totalEvents"          ) var totalEvents          : Int?             = null,
  @SerializedName("totalGames"           ) var totalGames           : Int?             = null,
  @SerializedName("totalGamesInProgress" ) var totalGamesInProgress : Int?             = null,
  @SerializedName("dates"                ) var dates                : ArrayList<Dates> = arrayListOf()

)