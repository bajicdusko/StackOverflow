package com.bajicdusko.stackoverflow.presenter

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
fun Presenter.initDisposables() {
  if (disposables.isDisposed) {
    disposables = CompositeDisposable()
  }
}

fun Presenter.rxDispose() {
  if (!disposables.isDisposed) {
    disposables.dispose()
  }
}

inline fun Presenter.rxTransaction(subscription: () -> Disposable) {
  initDisposables()
  disposables.add(subscription())
}