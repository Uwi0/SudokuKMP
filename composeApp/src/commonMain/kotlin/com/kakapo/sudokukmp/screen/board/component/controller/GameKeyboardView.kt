package com.kakapo.sudokukmp.screen.board.component.controller

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import com.kakapo.sudokukmp.presentation.game.GameUiState

@Composable
internal fun GameKeyboardView(uiState: GameUiState) {
    Row {
        uiState.numbers.forEach { number ->
            KeyboardItemView(
                number = number,
                remainingUse = uiState.remainingUse?.get(number - 1)
            )
        }
    }
}


