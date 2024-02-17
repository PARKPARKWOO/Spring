package com.example.demo.repository

import com.example.demo.entity.Person

interface PersonPort {
    fun save(): Person
    fun exception()
    fun runTimeException()

    fun requiresNew()
}
