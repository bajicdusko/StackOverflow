package com.bajicdusko.stackoverflow.domain.repository

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
interface CacheRepository {

  var username: String
  var password: String

  fun isSidebarShown(): Boolean
  fun isLoggedIn(): Boolean

  fun clear()
}
