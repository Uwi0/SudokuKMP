package com.kakapo.sudokukmp.screen.board.component.board.model

import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color

data class LinePosition(
    val col: Int,
    val row: Int,
    val gameSize: Int,
    val cellSize: Float,
    val lineLength: Float,
    val color: Color,
    val cornerRadius: CornerRadius
) {

    private val defaultRadius = CornerRadius.Zero

    val verticalRadius: CellRadius
        get() {
            return CellRadius(
                topLeft = if (col == 0) cornerRadius else defaultRadius,
                topRight = if (col == gameSize - 1) cornerRadius else defaultRadius,
                bottomLeft = if (col == 0) cornerRadius else defaultRadius,
                bottomRight = if (col == gameSize - 1) cornerRadius else defaultRadius
            )
        }

    val horizontalRadius: CellRadius
        get() {
            return CellRadius(
                topLeft = if (row == 0) cornerRadius else CornerRadius.Zero,
                topRight = if (row == 0) cornerRadius else CornerRadius.Zero,
                bottomLeft = if (row == gameSize - 1) cornerRadius else CornerRadius.Zero,
                bottomRight = if (row == gameSize - 1) cornerRadius else CornerRadius.Zero
            )
        }
}
