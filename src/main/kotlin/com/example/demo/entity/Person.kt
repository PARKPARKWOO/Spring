package com.example.demo.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.Id

@Entity
class Person(
    name: String,
    age: Int,
) {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private var id: Long? = null
    var name: String = name
        private set
    var age: Int = age
        private set
}
