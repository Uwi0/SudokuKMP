package com.kakapo.sudokukmp.board

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.kakapo.sudokukmp.model.Cage
import com.kakapo.sudokukmp.model.Cell

@Composable
fun BoardGameView(
    cage: Cage = Cage(cells = listOf(Cell(row = 9, col = 9)))
){
    if (cage.cells.isNotEmpty()){
        Column {
            for(row in 0 until cage.cells.first().col) {
                Row {
                    for (col in 0 until cage.cells.first().row) {
                        Text(text = "X")
                    }
                }
            }
        }
    }

}