package com.example.demo.repository

import com.example.demo.entity.Person
import com.example.demo.exception.DoException
import com.example.demo.exception.DoRunTimeException
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class PersonAdapter(
    val personRepository: PersonRepository,
) : PersonPort {
    @Transactional
    override fun createPerson(): Person {
        val person = Person(
            name = "name",
            10,
        )
        personRepository.save(person)
        return person
    }

    @Transactional
    override fun exception() {
        throw DoException()
    }

    @Transactional
    override fun runTimeException() {
        throw DoRunTimeException()
    }
}
