package com.karl.sprint.data.net.model

import com.karl.sprint.data.net.exception.ResultException

sealed class NetResult<out T : Any> {

    data class Success<out T : Any>(val data: T) : NetResult<T>()

    data class Error(val exception: ResultException) : NetResult<Nothing>()
}