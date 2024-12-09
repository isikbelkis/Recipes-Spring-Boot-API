package com.example.springboot_mysql_kotlin.entity

import jakarta.persistence.*

@Entity
@Table(name = "kategoriler")
data class Kategori(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(name = "kategori_adi")
    val kategoriAdi: String,

    @Column(name = "kategori_image")
    val kategoriImage: String
)
