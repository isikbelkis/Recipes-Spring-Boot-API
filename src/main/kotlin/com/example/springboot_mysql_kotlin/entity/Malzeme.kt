package com.example.springboot_mysql_kotlin.entity

import jakarta.persistence.*

@Entity
@Table(name = "malzemeler")
data class Malzeme(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(name = "tarif_id")
    val tarifId: Int,

    @Column(name = "malzeme")
    val malzeme: String
)

