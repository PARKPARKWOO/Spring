package com.example.demo.service

import com.example.demo.repository.PersonLogPort
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

@Service
class PersonLogService(
    private val personLogPort: PersonLogPort,
) {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    fun save() {
        personLogPort.save()
    }
}
