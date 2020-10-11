package com.example.demo

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import javax.persistence.*

@Entity
@Table(name = "PERSONS")
data class Persons(
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name = "PERSON_ID")
        var pid: Int?=null,
        @Column(name = "FIRST_NAME")
        var fname: String?=null,
        @Column(name = "LAST_NAME")
        var lname: String?=null
)

@Repository
interface CustomerRepository : CrudRepository<Persons?, Long?> {

}
