package com.example.springboot_mysql_kotlin.repository

import com.example.springboot_mysql_kotlin.entity.Tarif
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TarifRepository : JpaRepository<Tarif, Long> {
    // Eğer özel sorgular eklemek isterseniz, burada metodları tanımlayabilirsiniz.
    // Örneğin, tarif isimlerine göre arama yapmak için:
    fun findByTarifIsimContaining(tarifIsim: String): List<Tarif>
}
