package com.bajicdusko.stackoverflow.di.adapter

import com.bajicdusko.stackoverflow.ui.questions.QuestionViewHolder
import com.bajicdusko.stackoverflow.ui.questions.QuestionsAdapter
import dagger.Subcomponent

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */

@Subcomponent(modules = arrayOf(AdapterModule::class))
interface AdapterComponent {

  @Subcomponent.Builder
  interface Builder {
    fun adapterModule(adapterModule: AdapterModule): Builder
    fun build(): AdapterComponent
  }

  fun inject(questionsAdapter: QuestionsAdapter)
  fun inject(questionViewHolder: QuestionViewHolder)
}