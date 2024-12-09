package com.example.springboot_mysql_kotlin.controller

import com.example.springboot_mysql_kotlin.entity.Malzeme
import com.example.springboot_mysql_kotlin.service.MalzemeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/malzeme")
class MalzemeController @Autowired constructor(private val malzemeService: MalzemeService) {

    // Tüm malzemeleri listele
    @GetMapping
    fun getAllMalzemeler(): List<Malzeme> {
        return malzemeService.getAllMalzemeler()
    }

    // Tarif ID'si ile malzeme listesi al
    @GetMapping("/tarif/{tarifId}")
    fun getMalzemelerByTarifId(@PathVariable tarifId: Long): List<Malzeme> {
        return malzemeService.getMalzemelerByTarifId(tarifId)
    }

    // Yeni malzeme ekle
    @PostMapping
    fun createMalzeme(@RequestBody malzeme: Malzeme): Malzeme {
        return malzemeService.addMalzeme(malzeme)
    }
}
