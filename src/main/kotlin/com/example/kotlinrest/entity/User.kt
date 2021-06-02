package com.example.kotlinrest.entity

import javax.persistence.*


@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    var id: Long? = null,

    @Column(nullable = false)
    val name: String? = null,

    @Column(nullable = false)
    val age: Int? = null
)