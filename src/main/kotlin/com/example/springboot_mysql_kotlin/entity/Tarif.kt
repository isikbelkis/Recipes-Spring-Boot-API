package com.example.springboot_mysql_kotlin.entity

import jakarta.persistence.*

@Entity
@Table(name = "tarifler")
data class Tarif(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(name = "tarif_isim")
    val tarifIsim: String,

    @Column(name = "tarif_aciklama")
    val tarifAciklama: String,

    @Column(name = "kategori_id")
    val kategoriId: Int,

    @Column(name = "pisirme_onerisi")
    val pisirmeOnerisi: String,

    @Column(name = "pisirme_suresi")
    val pisirmeSuresi: Int,

    @Column(name = "kac_kisilik")
    val kacKisilik: Int,

    @Column(name = "kalori")
    val kalori: String,

    @Column(name = "image")
    val image: String
)
