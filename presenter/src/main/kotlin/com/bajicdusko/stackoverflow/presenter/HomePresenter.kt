package com.bajicdusko.stackoverflow.presenter

import android.os.Bundle
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class HomePresenter @Inject constructor() : Presenter {

  override var disposables: CompositeDisposable = CompositeDisposable()
  var view: View? = null

  override fun onSaveInstanceState(outState: Bundle?) {}

  override fun onRestoreInstanceState(savedInstanceState: Bundle?) {}

  override fun restore() {}

  interface View : Presenter.View
}

