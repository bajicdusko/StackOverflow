package com.bajicdusko.stackoverflow.di.app

import com.bajicdusko.stackoverflow.MyApplication
import com.bajicdusko.stackoverflow.di.activity.ActivityComponent
import com.bajicdusko.stackoverflow.domain.DIConstants
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Module(subcomponents = arrayOf(ActivityComponent::class))
class ApplicationModule(val app: MyApplication) {

  @Singleton
  @Provides
  @Named(DIConstants.APPLICATION)
  fun provideAppContext() = app
}