package com.karl.sprint.data.net.model

data class NetworkBaseModel<out T>(val errorCode: Int, val errorMsg: String, val data: T)