package com.kakapo.sudokukmp.board.state

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.kakapo.sudokukmp.model.Cell
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

@Composable
fun rememberBoardGame(boards: List<List<Cell>>): BoardGameState {
    return remember(boards) {
        BoardGameState(boards)
    }
}

class BoardGameState(boards: List<List<Cell>>) {

    val size: Int
        get() {
            return 9
        }

    val verThick: Int
        get() {
            return floor(sqrt(size.toFloat())).toInt()
        }

    val horThick: Int
        get() {
            return ceil(sqrt(size.toFloat())).toInt()
        }

    val thinLineWidth: Float
        @Composable get() {
            return with(LocalDensity.current) { 1.0.dp.toPx() }
        }

    val thickLineWidth: Float
        @Composable get() {
            return with(LocalDensity.current) { 2.dp.toPx() }
        }
}