package com.example.springboot_mysql_kotlin.service

import com.example.springboot_mysql_kotlin.entity.Malzeme
import com.example.springboot_mysql_kotlin.repository.MalzemeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MalzemeService(@Autowired private val malzemeRepository: MalzemeRepository) {

    fun getAllMalzemeler(): List<Malzeme> {
        return malzemeRepository.findAll()
    }

    // Tarif ID'sine göre malzemeleri listele
    fun getMalzemelerByTarifId(tarifId: Long): List<Malzeme> {
        return malzemeRepository.findByTarifId(tarifId)
    }

    // Yeni malzeme ekleme
    fun addMalzeme(malzeme: Malzeme): Malzeme {
        return malzemeRepository.save(malzeme)
    }
}
