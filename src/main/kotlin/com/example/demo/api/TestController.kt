package com.example.demo.api

import com.example.demo.service.NoTransactionService
import com.example.demo.service.TransactionService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    val transactionService: TransactionService,
    val noTransactionService: NoTransactionService,
) {
    @PostMapping("/test1")
    fun test1() {
        noTransactionService.save()
    }

    @PostMapping("/test2")
    fun test2() {
        transactionService.savePersonAndLog()
    }
}
