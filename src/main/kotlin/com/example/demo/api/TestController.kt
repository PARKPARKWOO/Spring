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
    // member 생김
    @PostMapping("/test1")
    fun test1() {
        transactionService.runException()
    }

    // member 안생김
    @PostMapping("/test2")
    fun test2() {
        transactionService.runRunTimeException()
    }

    // 생김
    @PostMapping("/test3")
    fun test3() {
        noTransactionService.runTimeException()
    }

    // 생김
    @PostMapping("/test4")
    fun test4() {
        noTransactionService.exception()
    }
}
