package com.example.demo.repository

import com.example.demo.entity.Cart
import com.example.demo.exception.DoRunTimeException
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class CartAdapter(
    private val cartRepository: CartRepository,
) : CartPort {
    @Transactional
    override fun save() {
        val cart = Cart()
        cartRepository.save(cart)
        throw DoRunTimeException()
    }
}
