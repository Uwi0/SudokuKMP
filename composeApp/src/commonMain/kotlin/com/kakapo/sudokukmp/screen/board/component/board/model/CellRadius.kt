package com.kakapo.sudokukmp.screen.board.component.board.model

import androidx.compose.ui.geometry.CornerRadius

data class CellRadius(
    val topLeft: CornerRadius,
    val topRight: CornerRadius,
    val bottomLeft: CornerRadius,
    val bottomRight: CornerRadius
)