package com.sgut.android.artcomposeapp

import com.google.gson.annotations.SerializedName


data class Venue (

  @SerializedName("id"   ) var id   : Int?    = null,
  @SerializedName("name" ) var name : String? = null,
  @SerializedName("link" ) var link : String? = null

)