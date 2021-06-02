package com.example.kotlinrest.repository

import com.example.kotlinrest.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface UserRepository : JpaRepository<User, Int> {
    fun findByName(name: String): User
}