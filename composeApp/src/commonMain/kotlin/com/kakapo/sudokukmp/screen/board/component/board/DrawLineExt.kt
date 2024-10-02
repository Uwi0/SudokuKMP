package com.kakapo.sudokukmp.screen.board.component.board

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import com.kakapo.sudokukmp.screen.board.component.board.model.LinePosition

fun DrawScope.drawLinesPosition(position: LinePosition){
    drawVerticalLinePosition(position)
    drawHorizontalLinePosition(position)
}

private fun DrawScope.drawVerticalLinePosition(position: LinePosition) {
    drawPath(
        path = Path().apply { addRoundRect(roundRect = verticalRect(position)) },
        color = position.color
    )
}

private fun verticalRect(position: LinePosition): RoundRect {
    return RoundRect(
        rect = Rect(
            offset = Offset(
                x = position.col * position.cellSize,
                y = 0f
            ),
            size = Size(position.cellSize, position.lineLength)
        ),
        topLeft = position.verticalRadius.topLeft,
        topRight = position.verticalRadius.topRight,
        bottomLeft = position.verticalRadius.bottomLeft,
        bottomRight = position.verticalRadius.bottomRight,
    )
}

private fun DrawScope.drawHorizontalLinePosition(position: LinePosition) {
    drawPath(
        path = Path().apply { addRoundRect(roundRect = horizontalRect(position)) },
        color = position.color
    )
}

private fun horizontalRect(position: LinePosition): RoundRect {
    return RoundRect(
        rect = Rect(
            offset = Offset(
                x = 0f,
                y = position.row * position.cellSize
            ),
            size = Size(position.lineLength, position.cellSize)
        ),
        topLeft = position.horizontalRadius.topLeft,
        topRight = position.horizontalRadius.topRight,
        bottomLeft = position.horizontalRadius.bottomLeft,
        bottomRight = position.horizontalRadius.bottomRight,
    )
}