package com.bajicdusko.stackoverflow.domain.repository

import com.bajicdusko.stackoverflow.domain.model.SOQuestion
import io.reactivex.Single

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
interface QuestionRepository {

  fun getQuestionsByTag(tag: String): Single<List<SOQuestion?>>
}