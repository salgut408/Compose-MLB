package com.sgut.android.composemlb.data.dtomappers

import com.sgut.android.artcomposeapp.Games
import com.sgut.android.composemlb.data.domainmodels.GamesDomainModel

class GamesDtoMapper: DomainMapperInterface<Games, GamesDomainModel> {
    override fun mapToDomainModel(model: Games): GamesDomainModel {
        return GamesDomainModel(
            content = model.content,
            dayNight = model.dayNight,
            doubleHeader = model.doubleHeader,
            gameDate = model.gameDate,
            gamePk = model.gamePk,
            link = model.link,
            officialDate = model.officialDate,
            season = model.season,
            seriesDescription = model.seriesDescription,
            seasonDisplay = model.seasonDisplay,
            status = model.status,
            teams = model.teams,
            venue = model.venue
        )
    }
}