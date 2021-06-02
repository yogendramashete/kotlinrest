package com.example.kotlinrest.controller

import com.example.kotlinrest.entity.User
import com.example.kotlinrest.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rest")
class RestController(val userService: UserService) {

    @GetMapping("/hello")
    fun greeting(): String {
        return "hello world";
    }

    @PostMapping("/users")
    fun saveUser(@RequestBody user: User) {
        userService.saveUser(user)
    }

    @GetMapping("/users/{name}")
    fun getUser(@PathVariable("name") name: String): User? {
        return userService.getUserByName(name)
    }

    @GetMapping("/users")
    fun getUsers(): Iterable<User> {
        return userService.getUserList()
    }
}