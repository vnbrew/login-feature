package com.module.jetpack.compose.login.protocol

import com.module.jetpack.compose.common.ComposableFeatureEntry

abstract class LoginEntry : ComposableFeatureEntry {
    final override val featureRoute = "login-feature"

    fun destination() = featureRoute
}