package com.bajicdusko.stackoverflow.domain.interactor

import com.bajicdusko.stackoverflow.domain.model.SOQuestion
import com.bajicdusko.stackoverflow.domain.repository.QuestionRepository
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
class GetQuestions @Inject constructor() : UseCase<List<SOQuestion?>, String> {

  @Inject lateinit var questionsRepository: QuestionRepository

  override fun execute(tag: String): Single<List<SOQuestion?>> = questionsRepository.getQuestionsByTag(tag)
}