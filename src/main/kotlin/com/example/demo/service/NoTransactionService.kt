package com.example.demo.service

import com.example.demo.repository.CartPort
import com.example.demo.repository.PersonAdapter
import org.springframework.stereotype.Service

@Service
class NoTransactionService(
    private val personAdapter: PersonAdapter,
    private val cartPort: CartPort,
) {
    fun save() {
        personAdapter.save()
        cartPort.save()
    }
}
