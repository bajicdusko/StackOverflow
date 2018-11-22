package com.bajicdusko.stackoverflow.domain.interactor

import io.reactivex.Single

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
interface SimpleUseCase<M> {

  fun execute(): Single<M>
}