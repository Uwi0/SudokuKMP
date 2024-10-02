package com.kakapo.sudokukmp.component.control

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.kakapo.sudokukmp.presentation.game.GameUiState
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
internal fun GameKeyboardView(uiState: GameUiState) {
    Row {
        uiState.numbers.forEach { number ->
            val hide = uiState.hideRemainingUse(number)
            Text("$number")
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
