package com.kakapo.sudokukmp.model

data class Cage(
    val id: Int = 0,
    val sum: Int = 0,
    val cells: List<Cell> = emptyList(),
){
    val size: Int get() = cells.size
}
