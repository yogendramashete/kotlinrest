package com.example.kotlinrest.service

import com.example.kotlinrest.entity.User
import com.example.kotlinrest.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService() {

    @Autowired
    lateinit var userRepository: UserRepository

    fun saveUser(name: String, age: Integer) {
        val user = User(name = name, age = age)
        userRepository.save(user)
    }

    fun getUser(name: String): User? {
        return userRepository.findByName(name)
    }

    fun getUsers(): Iterable<User> {
        return userRepository.findAll()
    }

}