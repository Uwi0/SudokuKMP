package com.kakapo.sudokukmp.component.board.model

import androidx.compose.ui.geometry.CornerRadius

data class CellRadius(
    val topLeft: CornerRadius,
    val topRight: CornerRadius,
    val bottomLeft: CornerRadius,
    val bottomRight: CornerRadius
)