package com.example.springboot_mysql_kotlin.service

import com.example.springboot_mysql_kotlin.entity.Yapilis
import com.example.springboot_mysql_kotlin.repository.YapilisRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class YapilisService(@Autowired private val yapilisRepository: YapilisRepository) {

    // Tarif ID'sine göre yapılış adımlarını listele
    fun getYapilisByTarifId(tarifId: Long): List<Yapilis> {
        return yapilisRepository.findByTarifId(tarifId)
    }

    // Yeni yapılış adımı ekleme
    fun addYapilis(yapilis: Yapilis): Yapilis {
        return yapilisRepository.save(yapilis)
    }
}
