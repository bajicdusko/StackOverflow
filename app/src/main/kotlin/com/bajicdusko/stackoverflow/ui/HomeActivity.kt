package com.bajicdusko.stackoverflow.ui

import android.os.Bundle
import com.bajicdusko.stackoverflow.R
import com.bajicdusko.stackoverflow.presenter.HomePresenter
import com.bajicdusko.stackoverflow.ui.fragment.HomeFragmentChannel
import com.bajicdusko.stackoverflow.ui.questions.QuestionsFragment
import javax.inject.Inject

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
class HomeActivity : BaseActivity(), HomePresenter.View, HomeFragmentChannel {

  @Inject lateinit var homePresenter: HomePresenter

  override fun getFrameLayoutContainerId(): Int = R.id.activity_home_fl_fragment_container

  override fun getLayoutId(): Int = R.layout.activity_home

  override fun inject() {
    injector.inject(this)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    homePresenter.view = this
    showHome()
  }

  override fun setToolbarTitle(titleId: Int) {
    supportActionBar?.title = getString(titleId)
  }

  override fun showHome() {
    simpleFragmentManager.replaceFragment(QuestionsFragment.newInstance())
  }

  override fun dispose() {
    homePresenter.dispose()
  }

  override fun restore() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}

