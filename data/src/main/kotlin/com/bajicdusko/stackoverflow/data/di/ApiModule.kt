package com.bajicdusko.stackoverflow.data.di

import com.bajicdusko.stackoverflow.data.api.AnnotationExclusionStrategy
import com.bajicdusko.stackoverflow.data.api.ApiFactory
import com.bajicdusko.stackoverflow.data.api.BooleanTypeAdapter
import com.bajicdusko.stackoverflow.data.api.DateTimeAdapter
import com.bajicdusko.stackoverflow.domain.repository.CacheRepository
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import org.joda.time.DateTime

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
@Module
class ApiModule {

  @Provides
  fun provideGson() = GsonBuilder()
      .registerTypeAdapter(Boolean::class.java, BooleanTypeAdapter())
      .registerTypeAdapter(DateTime::class.java, DateTimeAdapter())
      .addSerializationExclusionStrategy(AnnotationExclusionStrategy())
      .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
      .create()

  @Provides
  fun provideApiFactory(gson: Gson, cacheRepository: CacheRepository) = ApiFactory(gson, cacheRepository)

  @Provides
  fun provideQuestionsApi(apiFactory: ApiFactory) = apiFactory.createQuestionsApi()
}