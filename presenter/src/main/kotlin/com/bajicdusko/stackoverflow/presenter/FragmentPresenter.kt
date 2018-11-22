package com.bajicdusko.stackoverflow.presenter

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
interface FragmentPresenter : Presenter {

  interface View : Presenter.View {
    fun setTitle(): Unit?
  }
}