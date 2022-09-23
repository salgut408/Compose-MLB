package com.sgut.android.composemlb.data.dtomappers

interface DomainMapperInterface<T, DomainModel> {
    fun mapToDomainModel(model: T) : DomainModel
}