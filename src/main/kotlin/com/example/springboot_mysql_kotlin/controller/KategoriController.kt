package com.example.springboot_mysql_kotlin.controller

import com.example.springboot_mysql_kotlin.entity.Kategori
import com.example.springboot_mysql_kotlin.service.KategoriService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/kategoriler")
class KategoriController @Autowired constructor(private val kategoriService: KategoriService) {

    // Tüm kategorileri listele
    @GetMapping
    fun getAllKategoriler(): List<Kategori> {
        return kategoriService.getAllKategoriler()
    }

    // Kategori adını alarak kategori getir
    @GetMapping("/{kategoriAdi}")
    fun getKategoriByName(@PathVariable kategoriAdi: String): Kategori? {
        return try {
            kategoriService.getKategoriByName(kategoriAdi)
        } catch (e: IllegalArgumentException) {
            // Kategori bulunamazsa null döndürülebilir veya hata mesajı verilebilir
            null
        }
    }
}
