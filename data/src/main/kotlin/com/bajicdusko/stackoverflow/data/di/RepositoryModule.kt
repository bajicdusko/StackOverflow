package com.bajicdusko.stackoverflow.data.di

import android.content.SharedPreferences
import com.bajicdusko.stackoverflow.data.api.questions.QuestionsApi
import com.bajicdusko.stackoverflow.data.repository.CacheRepositoryData
import com.bajicdusko.stackoverflow.data.repository.QuestionRepositoryData
import com.bajicdusko.stackoverflow.domain.repository.CacheRepository
import com.bajicdusko.stackoverflow.domain.repository.QuestionRepository
import com.google.gson.Gson
import dagger.Module
import dagger.Provides

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
@Module
class RepositoryModule {

  @Provides
  fun providesCacheRepository(sharedPreferences: SharedPreferences, gson: Gson): CacheRepository =
      CacheRepositoryData(sharedPreferences, gson)

  @Provides
  fun providesQuestionsRepository(questionsApi: QuestionsApi): QuestionRepository =
      QuestionRepositoryData(questionsApi)
}