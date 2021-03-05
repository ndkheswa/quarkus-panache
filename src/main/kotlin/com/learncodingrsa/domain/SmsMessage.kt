package com.learncodingrsa.domain

import com.fasterxml.jackson.annotation.JsonProperty
import io.quarkus.hibernate.orm.panache.PanacheEntity
import io.quarkus.hibernate.orm.panache.PanacheEntityBase
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "messages")
data class SmsMessage (

    @Id
    @GeneratedValue
    @Type(type="org.hibernate.type.PostgresUUIDType")
    var Id: UUID = UUID.randomUUID(),

    @JsonProperty("fromNumber")
    var fromNumber: String? = "",

    @JsonProperty("toNumber")
    var toNumber: String = ""
) : PanacheEntityBase()