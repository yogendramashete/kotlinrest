package com.example.kotlinrest.service

import com.example.kotlinrest.entity.User
import org.springframework.stereotype.Service

@Service
class UserService() {
    private var user: User? = null

    fun saveUser(name:String, age:Int){
        user = User(name, age);
    }

    fun getUser(): User? {
        return user
    }

}