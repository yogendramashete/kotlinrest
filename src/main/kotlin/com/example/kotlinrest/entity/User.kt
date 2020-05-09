package com.example.kotlinrest.entity

import javax.persistence.*

@Entity
@Table(name = "user")
data class User constructor(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        var id: Long = -1,

        @Column(name = "name")
        var name: String = "",

        @Column(name = "age")
        var age: Integer = Integer(-1)
)