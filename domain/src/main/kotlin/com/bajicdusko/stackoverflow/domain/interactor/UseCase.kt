package com.bajicdusko.stackoverflow.domain.interactor

import io.reactivex.Single

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
interface UseCase<M, P> {

  fun execute(tag: P): Single<M>
}