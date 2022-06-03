package com.module.jetpack.compose.login.impl

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.module.jetpack.compose.common.Destinations
import com.module.jetpack.compose.common.di.injectedViewModel
import com.module.jetpack.compose.data.api.LocalDataProvider
import com.module.jetpack.compose.login.impl.di.DaggerLoginComponent
import com.module.jetpack.compose.login.impl.ui.LoginScreen
import com.module.jetpack.compose.login.protocol.LoginEntry
import javax.inject.Inject

class LoginEntryImpl @Inject constructor() : LoginEntry() {

    @Composable
    override fun NavGraphBuilder.Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {
        val viewModel = injectedViewModel {
            DaggerLoginComponent.builder().dataProvider(LocalDataProvider.current).build().viewModel
        }
        LoginScreen(viewModel = viewModel, onUserSelected = {})
    }
}