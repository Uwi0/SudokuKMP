package com.kakapo.sudokukmp.board

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.kakapo.sudokukmp.model.Cell
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

@Composable
fun BoardGameView(
    size: Int = 81,
    board: List<List<Cell>>,
    enabled: Boolean = true
) {
    val vertThick by remember(size) { mutableIntStateOf(floor(sqrt(size.toFloat())).toInt()) }
    val horThick by remember(size) { mutableIntStateOf(ceil(sqrt(size.toFloat())).toInt()) }
    val thickLineColor = MaterialTheme.colorScheme.primary
    val thinLineColor = MaterialTheme.colorScheme.error
    val thinLineWidth = with(LocalDensity.current) { 1.3.dp.toPx() }
    val thickLineWidth = with(LocalDensity.current) { 1.3.dp.toPx() }
    BoxWithConstraints(modifier = Modifier.fillMaxWidth().aspectRatio(1f).padding(4.dp)) {
        val maxWidth = constraints.maxWidth.toFloat()
        val cellSize = maxWidth / size.toFloat()
        Canvas(modifier = Modifier.fillMaxSize()) {
            for (i in 1 until size) {
                val isThickLine = i % horThick == 0
                drawLine(
                    color = if (isThickLine) thickLineColor else thinLineColor,
                    start = Offset(cellSize * i.toFloat(), 0f),
                    end = Offset(cellSize * i.toFloat(), maxWidth),
                    strokeWidth = if (isThickLine) thickLineWidth else thinLineWidth
                )
            }

            for (i in 1 until size) {
                val isThickLine = i % vertThick == 0
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
    }
}