package com.kakapo.sudokukmp.screen.board

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kakapo.sudokukmp.component.board.BoardGameView
import com.kakapo.sudokukmp.component.controller.GameControllerView
import com.kakapo.sudokukmp.component.controller.GameKeyboardView
import com.kakapo.sudokukmp.presentation.game.GameUiState

@Composable
fun BoardRoute() {
    BoardScreen()
}

@Composable
internal fun BoardScreen() {
    Scaffold(
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .padding(vertical = 24.dp, horizontal = 16.dp)
            ) {
                BoardGameView(boards = emptyList())
                Spacer(Modifier.weight(1f))
                GameControllerView(uiState = GameUiState(size = 9))
            }
        }
    )
}