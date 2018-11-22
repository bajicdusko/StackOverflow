package com.bajicdusko.stackoverflow.data.repository

import com.bajicdusko.stackoverflow.data.api.questions.QuestionsApi
import com.bajicdusko.stackoverflow.data.transform
import com.bajicdusko.stackoverflow.domain.DEFAULT_PAGE
import com.bajicdusko.stackoverflow.domain.DEFAULT_PAGE_SIZE
import com.bajicdusko.stackoverflow.domain.model.SOQuestion
import com.bajicdusko.stackoverflow.domain.repository.QuestionRepository
import io.reactivex.Flowable
import io.reactivex.Single

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */

class QuestionRepositoryData(val questionsApi: QuestionsApi) : QuestionRepository {

  override fun getQuestionsByTag(tag: String): Single<List<SOQuestion?>> {
    return questionsApi.get(DEFAULT_PAGE, DEFAULT_PAGE_SIZE, tag)
        .map { it.questions }
        .flatMap { if (it.isNotEmpty()) Flowable.fromIterable(it) else Flowable.empty() }
        .map { it.transform() }
        .toList()
  }
}