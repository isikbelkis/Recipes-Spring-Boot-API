package com.example.springboot_mysql_kotlin.controller

import com.example.springboot_mysql_kotlin.entity.Yapilis
import com.example.springboot_mysql_kotlin.service.YapilisService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/yapilis")
class YapilisController @Autowired constructor(private val yapilisService: YapilisService) {

    // Tarif ID'sine göre yapılışları al
    @GetMapping("/tarif/{tarifId}")
    fun getYapilisByTarifId(@PathVariable tarifId: Long): List<Yapilis> {
        return yapilisService.getYapilisByTarifId(tarifId)
    }

    // Yeni yapılış ekle
    @PostMapping
    fun createYapilis(@RequestBody yapilis: Yapilis): Yapilis {
        return yapilisService.addYapilis(yapilis)
    }
}
