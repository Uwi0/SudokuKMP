package com.kakapo.sudokukmp.component.controller

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Backspace
import androidx.compose.material.icons.automirrored.outlined.Undo
import androidx.compose.material.icons.outlined.Draw
import androidx.compose.material.icons.outlined.Lightbulb
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.vector.ImageVector
import com.kakapo.sudokukmp.presentation.game.GameAction

@Composable
internal fun ActionButtonView(image: ImageVector, title: String, onClick: () -> Unit) {
    Button(
        shape = MaterialTheme.shapes.medium,
        onClick = onClick,
        content = {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(imageVector = image, contentDescription = null)
                Text(text = title, style = MaterialTheme.typography.bodyMedium)
            }
        }
    )
}

@Composable
fun GameAction.asResource(): Pair<ImageVector, String> {
    return when (this) {
        GameAction.Erase -> Icons.AutoMirrored.Outlined.Backspace to "Erase"
        GameAction.Hint -> Icons.Outlined.Lightbulb to "Hint"
        GameAction.Note -> Icons.Outlined.Draw to "Note"
        GameAction.Undo -> Icons.AutoMirrored.Outlined.Undo to "Undo"
    }
}