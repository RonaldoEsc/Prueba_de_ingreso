package com.hrec.pruebadeingreso.models

import com.google.gson.annotations.SerializedName

class PostsResponse {
    @SerializedName("userId")
    private var userId: Int? = null
    @SerializedName("id")
    private var id: Int? = null
    @SerializedName("title")
    private var title: Int? = null
    @SerializedName("body")
    private var body: Int? = null
}