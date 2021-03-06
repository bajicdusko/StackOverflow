package com.bajicdusko.stackoverflow.presenter.questions

import android.os.Bundle
import com.bajicdusko.stackoverflow.domain.model.SOQuestion
import com.bajicdusko.stackoverflow.presenter.Presenter
import io.reactivex.disposables.CompositeDisposable
import java.util.*
import javax.inject.Inject

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
class QuestionsAdapterPresenter @Inject constructor() : Presenter {

  private var questions: List<SOQuestion?> = ArrayList()
  var view: View? = null

  override var disposables: CompositeDisposable = CompositeDisposable()

  override fun onSaveInstanceState(outState: Bundle?) {

  }

  override fun onRestoreInstanceState(savedInstanceState: Bundle?) {}

  override fun restore() {
    view?.notifyAdapter()
  }

  fun onDataChange(list: List<SOQuestion?>?) {
    if (list != null) {
      questions = list
    }

    view?.notifyAdapter()
  }

  interface View : Presenter.View {
    fun notifyAdapter()
  }

  fun getCount(): Int = questions.size
  fun getQuestion(position: Int) = questions[position]
}