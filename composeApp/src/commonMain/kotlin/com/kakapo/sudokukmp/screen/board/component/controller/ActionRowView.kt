package com.kakapo.sudokukmp.screen.board.component.controller

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kakapo.sudokukmp.presentation.game.GameAction

@Composable
internal fun ActionRowView() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
        GameAction.entries.forEach { action ->
            val (icon, title) = action.asResource()
            ActionButtonView(image = icon, title = title, onClick = {})
        }
    }
}
