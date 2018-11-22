package com.bajicdusko.stackoverflow.presenter.di

import com.bajicdusko.stackoverflow.data.di.DataModule
import dagger.Module

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
@Module(includes = arrayOf(DataModule::class))
class PresenterModule