package com.example.springboot_mysql_kotlin.entity

import jakarta.persistence.*

@Entity
@Table(name = "yapilis")
data class Yapilis(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(name = "tarif_id")
    val tarifId: Int,

    @Column(name = "adim")
    val adim: String,

    @Column(name = "sira")
    val sira: Int
)
