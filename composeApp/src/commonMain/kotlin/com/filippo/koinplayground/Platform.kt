package com.filippo.koinplayground

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform