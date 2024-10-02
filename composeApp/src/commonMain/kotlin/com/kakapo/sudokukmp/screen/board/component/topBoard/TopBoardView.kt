package com.kakapo.sudokukmp.screen.board.component.topBoard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun TopBoardView() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        DifficultyTextView()
        TimerTextView()
        PauseButton()
    }
}

@Composable
private fun DifficultyTextView() {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(text = "Difficulty", style = MaterialTheme.typography.titleMedium)
        Text(text = "Easy", style = MaterialTheme.typography.bodyMedium)
    }
}

@Composable
private fun TimerTextView() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(text = "Timer", style = MaterialTheme.typography.titleMedium)
        Text(text = "00:00", style = MaterialTheme.typography.bodyMedium)
    }
}

@Composable
private fun PauseButton() {
    Surface(shape = CircleShape, color = MaterialTheme.colorScheme.surfaceVariant) {
        IconButton(onClick = {}) {
            Icon(imageVector = Icons.Default.Pause, contentDescription = null)
        }
    }

}