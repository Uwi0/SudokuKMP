package com.kakapo.sudokukmp.component.control

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.kakapo.sudokukmp.presentation.game.GameUiState
import org.jetbrains.compose.ui.tooling.preview.Preview

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


@Composable
@Preview
internal fun GameKeyboardViewPreview() {
    Surface {
        GameKeyboardView(uiState = GameUiState())
    }
}
