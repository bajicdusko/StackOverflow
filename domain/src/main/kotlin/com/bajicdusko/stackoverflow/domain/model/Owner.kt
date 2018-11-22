package com.bajicdusko.stackoverflow.domain.model

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
data class Owner(
    val reputation: Int,
    val userId: Long,
    val avatar: String,
    val displayName: String,
    val profileUrl: String)