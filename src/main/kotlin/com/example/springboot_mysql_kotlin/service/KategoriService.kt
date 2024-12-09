package com.example.springboot_mysql_kotlin.service

import com.example.springboot_mysql_kotlin.entity.Kategori
import com.example.springboot_mysql_kotlin.repository.KategoriRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class KategoriService(@Autowired private val kategoriRepository: KategoriRepository) {

    fun getAllKategoriler(): List<Kategori> {
        return kategoriRepository.findAll()
    }

    // Kategori ismine göre kategori bulma
    fun getKategoriByName(kategoriAdi: String): Kategori? {
        return kategoriRepository.findByKategoriAdi(kategoriAdi)
            ?: throw IllegalArgumentException("Kategori bulunamadı: $kategoriAdi")
    }
}
