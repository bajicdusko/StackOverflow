package com.bajicdusko.stackoverflow.di.app

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */

@Module
@Singleton
class AndroidModule(val context: Context) {

  @Provides
  @Singleton
  fun providesSharedPreferences() = context.getSharedPreferences("private_pref", Context.MODE_PRIVATE)
}