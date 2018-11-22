package com.bajicdusko.stackoverflow.di.app

import com.bajicdusko.stackoverflow.MyApplication
import com.bajicdusko.stackoverflow.di.activity.ActivityComponent
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */

@Singleton
@Component(modules = arrayOf(ApplicationModule::class, AndroidModule::class))
interface ApplicationComponent {

  fun activityBuilder(): ActivityComponent.Builder

  fun inject(app: MyApplication)
}

