package com.example.demo.service

import com.example.demo.repository.PersonPort
import com.example.demo.repository.PersonRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class TransactionService(
    val personRepository: PersonRepository,
    val noTransactionService: NoTransactionService,
    val personPort: PersonPort,
    val personLogService: PersonLogService,
) {
    @Transactional
    fun createPerson() {
        personPort.save()

        try {
            personPort.requiresNew()
        } catch (_: RuntimeException) {
        }

        println("Create Person Thread = ${Thread.currentThread().name}")
    }

    @Transactional
    fun savePersonAndLog() {
        personPort.save()
        try {
            personLogService.save()
        } catch (ignore: RuntimeException) {
        }
    }
}
