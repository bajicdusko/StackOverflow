package com.bajicdusko.stackoverflow.data.di

import dagger.Module

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
@Module(includes = arrayOf(ApiModule::class, RepositoryModule::class))
class DataModule {
}