package com.bajicdusko.stackoverflow.data.api

import com.google.gson.ExclusionStrategy
import com.google.gson.FieldAttributes

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
class AnnotationExclusionStrategy : ExclusionStrategy {
  override fun shouldSkipClass(clazz: Class<*>?): Boolean = false

  override fun shouldSkipField(f: FieldAttributes?): Boolean = f?.getAnnotation(Exclude::class.java) != null
}