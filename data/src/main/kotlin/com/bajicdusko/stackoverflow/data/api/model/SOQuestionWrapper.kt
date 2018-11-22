package com.bajicdusko.stackoverflow.data.api.model

import com.bajicdusko.stackoverflow.data.api.model.stackoverflow.SOQuestionData
import com.google.gson.annotations.SerializedName

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
data class SOQuestionWrapper(
    @SerializedName("items") val questions: List<SOQuestionData>
)