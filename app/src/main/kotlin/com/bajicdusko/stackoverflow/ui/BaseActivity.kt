package com.bajicdusko.stackoverflow.ui

import android.os.Bundle
import butterknife.ButterKnife
import com.bajicdusko.kotlinfragmentmanager.SFMActivity
import com.bajicdusko.stackoverflow.MyApplication

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
abstract class BaseActivity : SFMActivity() {

  abstract fun inject()
  abstract fun getLayoutId(): Int

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(getLayoutId())
    inject()
    ButterKnife.bind(this)
  }

  val injector by lazy { (application as MyApplication).activityComponent(this) }
}