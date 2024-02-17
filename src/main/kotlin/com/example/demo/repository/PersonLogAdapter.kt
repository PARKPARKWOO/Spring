package com.example.demo.repository

import com.example.demo.entity.PersonLog
import com.example.demo.exception.DoRunTimeException
import org.springframework.stereotype.Component

@Component
class PersonLogAdapter(
    private val personLogRepository: PersonLogRepository,
) : PersonLogPort {
    override fun save() {
        val personLog = PersonLog()
        personLogRepository.save(personLog)
        throw DoRunTimeException()
    }
}
