package com.kakapo.sudokukmp.component.control

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun RowScope.KeyboardItemView(number: Int, remainingUse: Int?) {
    val hasRemainingUse = remainingUse != null
    Box(modifier = Modifier.weight(1f)) {
        Column(
            modifier = Modifier.padding(7.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                number.toString(16).uppercase(),
                style = MaterialTheme.typography.titleLarge
            )
            if (hasRemainingUse) {
                Text(
                    text = remainingUse.toString(),
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}