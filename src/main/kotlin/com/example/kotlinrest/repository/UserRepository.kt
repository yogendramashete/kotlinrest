package com.example.kotlinrest.repository

import com.example.kotlinrest.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Integer> {
    fun findByName(name:String):User
}