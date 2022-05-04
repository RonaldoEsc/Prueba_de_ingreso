package com.hrec.pruebadeingreso.retrofit

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.hrec.pruebadeingreso.models.PostsResponse
import com.hrec.pruebadeingreso.models.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WS {
    companion object {
        private val ws by lazy { IWS.create() }

        fun getUsers(completion: (List<UserResponse>?) -> Unit) {
            val call = ws.getUsers()
            call.enqueue(object : Callback<JsonArray> {
                override fun onResponse(call: Call<JsonArray>, response: Response<JsonArray>) {
                    TODO("Not yet implemented")
                }

                override fun onFailure(call: Call<JsonArray>, t: Throwable) {
                    completion(null)
                }

            })
        }

        fun getPosts(userId: Int?, completion: (List<PostsResponse>?) -> Unit) {
            val call: Call<JsonArray> = if (userId != null) {
                ws.getPosts(userId)
            } else {
                ws.getPosts()
            }
            call.enqueue(object : Callback<JsonArray> {
                override fun onResponse(call: Call<JsonArray>, response: Response<JsonArray>) {
                    TODO("Not yet implemented")
                }

                override fun onFailure(call: Call<JsonArray>, t: Throwable) {
                    completion(null)
                }

            })
        }
    }
}