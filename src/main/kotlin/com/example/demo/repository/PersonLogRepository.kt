package com.example.demo.repository

import com.example.demo.entity.PersonLog
import org.springframework.data.jpa.repository.JpaRepository

interface PersonLogRepository : JpaRepository<PersonLog, Long>
