package com.hrec.pruebadeingreso.interfaces

import com.hrec.pruebadeingreso.models.UserResponse

interface ChangeActivities {
    fun onChangeActivity(user: UserResponse)
}