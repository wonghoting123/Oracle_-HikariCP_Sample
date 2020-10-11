package com.example.demo.component

import com.example.demo.CustomerRepository
import com.example.demo.Persons
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class Scheduler {

    @Autowired
    var repo : CustomerRepository? = null

    @Scheduled(fixedRate = 8000)
    fun fixedRateSch() {
        println("fixedRateSch !!!!!!!!!!!!!!!!")
        repo!!.findAll().also {
            it.forEach {
                println(it.toString())
            }

        }

        repo!!.save(Persons(
                null,
                "hih",
                "on99"
        ))
    }
}