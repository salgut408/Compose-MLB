package com.sgut.android.artcomposeapp

import com.google.gson.annotations.SerializedName


data class Home (

  @SerializedName("leagueRecord" ) var leagueRecord : LeagueRecord? = LeagueRecord(),
  @SerializedName("team"         ) var team         : Team?         = Team(),
  @SerializedName("splitSquad"   ) var splitSquad   : Boolean?      = null,
  @SerializedName("seriesNumber" ) var seriesNumber : Int?          = null

)