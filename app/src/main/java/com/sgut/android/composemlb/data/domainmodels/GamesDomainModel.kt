package com.sgut.android.composemlb.data.domainmodels

import com.google.gson.annotations.SerializedName
import com.sgut.android.artcomposeapp.Content
import com.sgut.android.artcomposeapp.Status
import com.sgut.android.artcomposeapp.Teams
import com.sgut.android.artcomposeapp.Venue

data class GamesDomainModel(
    val gamePk: Int? = null,
    var link: String? = null,
    var gameType: String? = null,
    var season: String? = null,
    var gameDate: String? = null,
    var officialDate: String? = null,
    var status: Status? = Status(),
    var teams: Teams? = Teams(),
    var venue: Venue? = Venue(),
    var content: Content? = Content(),
    var doubleHeader: String? = null,
    var seasonDisplay: String? = null,
    var dayNight: String? = null,
    var seriesDescription: String? = null,

    )
