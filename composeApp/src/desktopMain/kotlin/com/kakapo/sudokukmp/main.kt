package com.kakapo.sudokukmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Sudoku KMP",
    ) {
        App()
    }
}