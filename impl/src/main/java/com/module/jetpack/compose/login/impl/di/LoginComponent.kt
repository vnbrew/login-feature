package com.module.jetpack.compose.login.impl.di

import com.module.jetpack.compose.common.di.FeatureScoped
import com.module.jetpack.compose.data.api.DataProvider
import com.module.jetpack.compose.login.impl.LoginViewModel
import com.module.jetpack.compose.login.protocol.LoginProvider
import dagger.Component

@FeatureScoped
@Component(
    modules = [LoginModule::class],
    dependencies = [DataProvider::class]
)
interface LoginComponent : LoginProvider {
    val viewModel: LoginViewModel
}