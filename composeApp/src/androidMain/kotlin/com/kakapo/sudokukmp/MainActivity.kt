package com.kakapo.sudokukmp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kakapo.sudokukmp.component.board.BoardGameView
import com.kakapo.sudokukmp.screen.board.BoardRoute
import com.kakapo.sudokukmp.screen.board.BoardScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoardRoute()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    Surface {
        BoardGameView(boards = emptyList())
    }
}