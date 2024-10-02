package com.kakapo.sudokukmp.presentation.game

data class GameUiState(
    val size: Int = 0,
    val remainingUse: List<Int>? = null
) {
    val numbers: List<Int>
        get() {
            return (1..size).toList()
        }

    val fontSize: Int get() {
        return if(remainingUse != null) 25 else 36

    }

    fun hideRemainingUse(number: Int): Boolean {
        return remainingUse != null && (remainingUse.size > number && remainingUse[number - 1] <= 0)
    }

}
