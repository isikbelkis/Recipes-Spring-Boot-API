package com.example.springboot_mysql_kotlin.service

import com.example.springboot_mysql_kotlin.entity.Tarif
import com.example.springboot_mysql_kotlin.repository.TarifRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TarifService(@Autowired private val tarifRepository: TarifRepository) {

    // Bütün tarifleri listele
    fun getAllTarifler(): List<Tarif> {
        return tarifRepository.findAll()
    }

    // ID'ye göre tarif getirme
    fun getTarifById(id: Long): Tarif? {
        return tarifRepository.findById(id).orElse(null)
    }

    // Tarif ismine göre arama
    fun searchTarifByName(tarifIsim: String): List<Tarif> {
        return tarifRepository.findByTarifIsimContaining(tarifIsim)
    }

    // Yeni tarif ekleme
    fun addTarif(tarif: Tarif): Tarif {
        return tarifRepository.save(tarif)
    }

    // Tarif güncelleme
    fun updateTarif(id: Long, tarif: Tarif): Tarif? {
        return if (tarifRepository.existsById(id)) {
            tarifRepository.save(tarif)
        } else {
            null
        }
    }

    // Tarif silme
    fun deleteTarif(id: Long) {
        if (tarifRepository.existsById(id)) {
            tarifRepository.deleteById(id)
        }
    }
}
