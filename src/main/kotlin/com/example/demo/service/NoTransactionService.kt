package com.example.demo.service

import com.example.demo.repository.PersonAdapter
import org.springframework.stereotype.Service

@Service
class NoTransactionService(
    private val personAdapter: PersonAdapter,
) {
    fun runTimeException() {
        personAdapter.createPerson()
        personAdapter.runTimeException()
    }
    fun exception() {
        personAdapter.createPerson()
        personAdapter.exception()
    }
}
