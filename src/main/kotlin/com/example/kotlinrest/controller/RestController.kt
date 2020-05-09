package com.example.kotlinrest.controller

import com.example.kotlinrest.entity.User
import com.example.kotlinrest.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rest")
class RestController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping("/hello")
    fun greeting(@RequestParam("name") name: String): String {
        return "hello $name";
    }

    @PostMapping("/user/save")
    fun saveUser(@RequestParam("name") name: String, @RequestParam("age") age: Integer) {
        userService.saveUser(name, age)
    }

    @GetMapping("/user")
    fun getUser(@RequestParam("name") name: String): User? {
        return userService.getUser(name)
    }

    @GetMapping("/getUsers")
    fun getUsers(): Iterable<User> {
        return userService.getUsers()
    }
}