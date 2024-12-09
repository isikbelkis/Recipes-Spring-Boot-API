package com.example.springboot_mysql_kotlin.repository

import com.example.springboot_mysql_kotlin.entity.Yapilis
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface YapilisRepository : JpaRepository<Yapilis, Long> {
    // Tarif id'sine göre yapılış adımlarını getiren metod
    fun findByTarifId(tarifId: Long): List<Yapilis>
}
