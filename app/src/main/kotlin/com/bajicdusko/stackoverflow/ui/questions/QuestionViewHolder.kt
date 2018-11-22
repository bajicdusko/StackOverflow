package com.bajicdusko.stackoverflow.ui.questions

import android.view.View
import android.widget.TextView
import butterknife.BindView
import com.bajicdusko.stackoverflow.R
import com.bajicdusko.stackoverflow.di.adapter.AdapterComponent
import com.bajicdusko.stackoverflow.presenter.questions.QuestionViewHolderPresenter
import com.bajicdusko.stackoverflow.presenter.questions.QuestionsAdapterPresenter
import com.bajicdusko.stackoverflow.ui.adapter.BaseViewHolder
import com.bajicdusko.stackoverflow.ui.asHtml
import javax.inject.Inject

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
class QuestionViewHolder(view: View, adapterComponent: AdapterComponent,
    questionsAdapterPresenter: QuestionsAdapterPresenter) :
    BaseViewHolder(view), QuestionViewHolderPresenter.View {

  companion object {
    val LAYOUT_ID = R.layout.item_view_question
  }

  @Inject lateinit var questionViewHolderPresenter: QuestionViewHolderPresenter

  @BindView(R.id.item_view_question_tv_title) lateinit var tvTitle: TextView
  @BindView(R.id.item_view_question_tv_url) lateinit var tvQuestionIUrl: TextView

  init {
    adapterComponent.inject(this)
    questionViewHolderPresenter.view = this
    questionViewHolderPresenter.adapterPresenter = questionsAdapterPresenter
  }

  override fun setTitle(title: String?) {
    tvTitle.text = title.asHtml()
  }

  override fun setQuestionUrl(questionUrl: String?) {
    tvQuestionIUrl.text = questionUrl
  }
}