package com.module.jetpack.compose.login.protocol

import androidx.compose.runtime.compositionLocalOf

interface LoginProvider

val LocalLoginProvider = compositionLocalOf<LoginProvider> {
    error("No Login provider found!")
}