package com.kakapo.sudokukmp.component.board.model

import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Rect

data class RoundRectCell(
    val row: Int,
    val col: Int,
    val gameSize: Int,
    val rect: Rect,
    val cornerRadius: CornerRadius
) {
    private val defaultRadius = CornerRadius.Zero
    val radius: CellRadius
        get() {
            return CellRadius(
                topLeft = if (row == 0 && col == 0) cornerRadius else defaultRadius,
                topRight = if (row == 0 && col == gameSize - 1) cornerRadius else defaultRadius,
                bottomLeft = if (row == gameSize - 1 && col == 0) cornerRadius else defaultRadius,
                bottomRight = if (row == gameSize - 1 && col == gameSize - 1) cornerRadius else defaultRadius,
            )
        }
}
