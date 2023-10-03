package com.example.bank

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity(name = "accounts")
data class Account(
    @Id @GeneratedValue
    var id: Long? = null,
    var name: String,
    var document: String,
    var phone: String
) {
}