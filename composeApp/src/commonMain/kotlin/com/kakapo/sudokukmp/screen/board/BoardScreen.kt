package com.kakapo.sudokukmp.screen.board

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kakapo.sudokukmp.designSystem.component.button.CustomIconButton
import com.kakapo.sudokukmp.screen.board.component.board.BoardGameView
import com.kakapo.sudokukmp.screen.board.component.controller.GameControllerView
import com.kakapo.sudokukmp.screen.board.component.topBoard.TopBoardView
import com.kakapo.sudokukmp.presentation.game.GameUiState

@Composable
fun BoardRoute() {
    BoardScreen()
}

@Composable
internal fun BoardScreen() {
    Scaffold(
        topBar = {
            BoardTopAppbarView()
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .padding(vertical = 24.dp, horizontal = 16.dp)
            ) {
                TopBoardView()
                Spacer(Modifier.size(24.dp))
                BoardGameView(boards = emptyList())
                Spacer(Modifier.weight(1f))
                GameControllerView(uiState = GameUiState(size = 9))
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun BoardTopAppbarView() {
    TopAppBar(
        title = {},
        navigationIcon = {
            CustomIconButton(
                icon = Icons.AutoMirrored.Filled.ArrowBack,
                onClick = {}
            )
        },
        actions = {
            CustomIconButton(
                icon = Icons.Outlined.Settings,
                onClick = {}
            )
        }
    )
}