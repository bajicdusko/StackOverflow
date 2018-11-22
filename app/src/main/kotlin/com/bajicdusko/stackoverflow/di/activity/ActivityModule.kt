package com.bajicdusko.stackoverflow.di.activity

import android.content.Context
import android.view.LayoutInflater
import com.bajicdusko.stackoverflow.di.adapter.AdapterComponent
import com.bajicdusko.stackoverflow.domain.DIConstants
import com.bajicdusko.stackoverflow.presenter.di.PresenterModule
import com.bajicdusko.stackoverflow.ui.BaseActivity
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
@ActivityScope
@Module(includes = arrayOf(PresenterModule::class), subcomponents = arrayOf(AdapterComponent::class))
class ActivityModule(private val baseActivity: BaseActivity) {

  @Provides
  @Named(DIConstants.ACTIVITY)
  fun provideActivityContext(): Context = baseActivity as Context

  @Provides
  fun provideLayoutInflater(): LayoutInflater = baseActivity.layoutInflater
}