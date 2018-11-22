package com.bajicdusko.stackoverflow.data.exception

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
class DateParsingException(message: String, ex: Exception?) : Exception(message, ex) {
  constructor(millis: Long?, ex: Exception) : this(millis.toString(), ex)
  constructor(message: String) : this(message, null)
}