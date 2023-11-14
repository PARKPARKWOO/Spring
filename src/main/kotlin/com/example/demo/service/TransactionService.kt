package com.example.demo.service

import com.example.demo.entity.Person
import com.example.demo.exception.DoException
import com.example.demo.exception.DoRunTimeException
import com.example.demo.repository.PersonRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class TransactionService(
    val personRepository: PersonRepository,
) {

    @Transactional
    fun runException() {
        createPerson()
        exception()
    }

    @Transactional
    fun runRunTimeException() {
        createPerson()
        runTimeException()
    }

    @Transactional
    fun createPerson(): Person {
        val person = Person(
            name = "name",
            10,
        )
        personRepository.save(person)
        return person
    }

    @Transactional
    fun exception() {
        throw DoException()
    }

    @Transactional
    fun runTimeException() {
        throw DoRunTimeException()
    }
}
