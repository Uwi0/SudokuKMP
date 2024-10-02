package com.kakapo.sudokukmp.component.controller

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kakapo.sudokukmp.presentation.game.GameUiState

@Composable
internal fun GameControllerView(uiState: GameUiState) {
    Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        ActionRowView()
        GameKeyboardView(uiState = uiState)
    }
}