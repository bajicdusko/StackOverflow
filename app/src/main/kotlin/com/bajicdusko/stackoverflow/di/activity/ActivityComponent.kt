package com.bajicdusko.stackoverflow.di.activity

import com.bajicdusko.stackoverflow.di.adapter.AdapterComponent
import com.bajicdusko.stackoverflow.ui.HomeActivity
import com.bajicdusko.stackoverflow.ui.fragment.auth.LoginFragment
import com.bajicdusko.stackoverflow.ui.questions.QuestionsFragment
import dagger.Subcomponent

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

  fun adapterBuilder(): AdapterComponent.Builder

  @Subcomponent.Builder
  interface Builder {

    fun activityModule(activityModule: ActivityModule): Builder
    fun build(): ActivityComponent
  }

  fun inject(homeActivity: HomeActivity)
  fun inject(loginFragment: LoginFragment)
  fun inject(questionsFragment: QuestionsFragment)
}