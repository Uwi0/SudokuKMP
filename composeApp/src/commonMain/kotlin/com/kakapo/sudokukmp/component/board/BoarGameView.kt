package com.kakapo.sudokukmp.component.board

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.dp
import com.kakapo.sudokukmp.component.board.state.BoardGameState
import com.kakapo.sudokukmp.component.board.state.rememberBoardGame
import com.kakapo.sudokukmp.model.Cell

@Composable
fun BoardGameView(
    boards: List<List<Cell>>
) {
    val gameState = rememberBoardGame(boards)
    val thickLineColor = MaterialTheme.colorScheme.primary
    val thinLineColor = MaterialTheme.colorScheme.error
    val thickLineWidth = gameState.thickLineWidth
    val thinLineWidth = gameState.thinLineWidth

    BoxWithConstraints(modifier = Modifier.fillMaxWidth().aspectRatio(1f).padding(4.dp)) {
        val maxWidth = constraints.maxWidth.toFloat()
        val cellSize = maxWidth / gameState.size.toFloat()
        Canvas(modifier = Modifier.fillMaxSize()) {

            drawBoardBackground(
                thickLineColor,
                thickLineWidth,
                maxWidth,
                gameState,
                thinLineColor,
                cellSize,
                thinLineWidth
            )
        }
    }
}

private fun DrawScope.drawBoardBackground(
    thickLineColor: Color,
    thickLineWidth: Float,
    maxWidth: Float,
    gameState: BoardGameState,
    thinLineColor: Color,
    cellSize: Float,
    thinLineWidth: Float
) {

    drawBoardFrame(
        thickLineColor = thickLineColor,
        thickLineWidth = thickLineWidth,
        maxWidth = maxWidth
    )

    for (i in 1 until gameState.size) {
        val isThickLine = i % gameState.horThick == 0

        drawLine(
            color = if (isThickLine) thickLineColor else thinLineColor,
            start = Offset(cellSize * i.toFloat(), 0f),
            end = Offset(cellSize * i.toFloat(), maxWidth),
            strokeWidth = if (isThickLine) thickLineWidth else thinLineWidth
        )
    }

    for (i in 1 until gameState.size) {
        val isThickLine = i % gameState.verThick == 0
        if (maxWidth >= cellSize * i) {
            drawLine(
                color = if (isThickLine) thickLineColor else thinLineColor,
                start = Offset(0f, cellSize * i.toFloat()),
                end = Offset(maxWidth, cellSize * i.toFloat()),
                strokeWidth = if (isThickLine) thickLineWidth else thinLineWidth
            )
        }
    }
}