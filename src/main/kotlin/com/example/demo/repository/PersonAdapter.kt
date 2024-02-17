package com.example.demo.repository

import com.example.demo.entity.Person
import com.example.demo.exception.DoException
import com.example.demo.exception.DoRunTimeException
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

@Component
class PersonAdapter(
    val personRepository: PersonRepository,
) : PersonPort {
    @Transactional
    override fun save(): Person {
        val person = Person(
            name = "name",
            10,
        )
        return personRepository.save(person)
    }

    @Transactional
    override fun exception() {
        throw DoException()
    }

    override fun runTimeException() {
        val person = Person(
            name = "우영",
            20,
        )
        personRepository.save(person)
        throw DoRunTimeException()
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    override fun requiresNew() {
        println("RequiresNew Exception")
        val person = Person(
            name = "우영",
            20,
        )
        personRepository.save(person)
        throw DoRunTimeException()
    }
}
