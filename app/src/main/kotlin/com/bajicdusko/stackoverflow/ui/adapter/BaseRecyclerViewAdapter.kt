package com.bajicdusko.stackoverflow.ui.adapter

import android.support.v7.widget.RecyclerView
import com.bajicdusko.stackoverflow.di.activity.ActivityComponent
import com.bajicdusko.stackoverflow.di.adapter.AdapterModule

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
abstract class BaseRecyclerViewAdapter<VH : BaseViewHolder>(
    activityComponent: ActivityComponent) : RecyclerView.Adapter<VH>() {
  protected val injector = activityComponent.adapterBuilder().adapterModule(AdapterModule()).build()
}