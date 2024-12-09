package com.example.springboot_mysql_kotlin.repository

import com.example.springboot_mysql_kotlin.entity.Kategori
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface KategoriRepository : JpaRepository<Kategori, Long> {
    // Kategori ismine göre kategori arayan metod
    fun findByKategoriAdi(kategoriAdi: String): Kategori?
}
