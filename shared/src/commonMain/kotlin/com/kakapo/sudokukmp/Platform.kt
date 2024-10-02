package com.kakapo.sudokukmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform