package com.example.springboot_mysql_kotlin.controller

import com.example.springboot_mysql_kotlin.entity.Tarif
import com.example.springboot_mysql_kotlin.service.TarifService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/tarifler")
class TarifController @Autowired constructor(private val tarifService: TarifService) {

    // Tüm tarifleri listele
    @GetMapping
    fun getAllTarifler(): List<Tarif> {
        return tarifService.getAllTarifler()
    }
}
