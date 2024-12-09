package com.example.springboot_mysql_kotlin.repository

import com.example.springboot_mysql_kotlin.entity.Malzeme
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MalzemeRepository : JpaRepository<Malzeme, Long> {
    // Tarif id'sine göre malzemeleri getiren metod
    fun findByTarifId(tarifId: Long): List<Malzeme>
}
