package com.module.jetpack.compose.login.impl.di

import com.module.jetpack.compose.common.FeatureEntry
import com.module.jetpack.compose.common.di.FeatureEntryKey
import com.module.jetpack.compose.login.impl.LoginEntryImpl
import com.module.jetpack.compose.login.protocol.LoginEntry
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface LoginEntryModule {

    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(LoginEntry::class)
    fun loginEntry(entry: LoginEntryImpl): FeatureEntry
}