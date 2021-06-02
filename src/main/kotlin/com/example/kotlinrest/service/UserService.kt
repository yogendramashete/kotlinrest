package com.example.kotlinrest.service

import com.example.kotlinrest.entity.User
import com.example.kotlinrest.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) {

    fun saveUser(user: User) = userRepository.save(user)

    fun getUserByName(name: String): User = userRepository.findByName(name)

    fun getUserList(): List<User> = userRepository.findAll()
}