package com.bajicdusko.stackoverflow.presenter.login

import android.os.Bundle
import com.bajicdusko.stackoverflow.presenter.FragmentPresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
class LoginPresenter @Inject constructor() : FragmentPresenter {

  var view: View? = null

  override var disposables: CompositeDisposable = CompositeDisposable()

  override fun onSaveInstanceState(outState: Bundle?) {}

  override fun onRestoreInstanceState(savedInstanceState: Bundle?) {}

  override fun restore() {}

  interface View : FragmentPresenter.View {
    fun showHome()
  }

  fun onLogin() {
    view?.showHome()
  }
}