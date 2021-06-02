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
    fun greeting(): String = "hello world"

    @PostMapping("/users")
    fun saveUser(@RequestBody user: User) =
        userService.saveUser(user)

    @GetMapping("/users/{name}")
    fun getUser(@PathVariable("name") name: String): User = userService.getUserByName(name)

    @GetMapping("/users")
    fun getUsers(): List<User> = userService.getUserList()
}