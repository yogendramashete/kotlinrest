package com.example.kotlinrest.controller

import com.example.kotlinrest.entity.User
import com.example.kotlinrest.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {

    @Autowired
    private val userService: UserService? = null

    @GetMapping("/rest/hello")
    fun greeting(@RequestParam("name") name: String): String {
        return "hello$name";
    }

    @PostMapping("/rest/user/save")
    fun saveUser(@RequestParam("name") name: String, @RequestParam("age") age: Int) {
        userService?.saveUser(name, age)
    }

    @GetMapping("/rest/user")
    fun getUser(): User? {
        return userService?.getUser()
    }
}