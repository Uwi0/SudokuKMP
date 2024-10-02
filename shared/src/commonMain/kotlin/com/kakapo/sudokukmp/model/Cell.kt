package com.kakapo.sudokukmp.model

data class Cell(
    val row: Int,
    val col: Int,
    var value: Int = 0,
    var error: Boolean = false,
    var locked: Boolean = false
)
