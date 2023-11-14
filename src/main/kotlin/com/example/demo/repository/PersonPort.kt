package com.example.demo.repository

import com.example.demo.entity.Person

interface PersonPort {
    fun createPerson(): Person
    fun exception()
    fun runTimeException()
}
