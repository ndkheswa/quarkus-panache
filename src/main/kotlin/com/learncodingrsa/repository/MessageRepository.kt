package com.learncodingrsa.repository

import com.learncodingrsa.domain.SmsMessage
import io.quarkus.hibernate.orm.panache.PanacheEntityBase.findByIdOptional
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase
import java.util.*
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class MessageRepository : PanacheRepositoryBase<SmsMessage, UUID> {

    fun findById(Id: UUID, message: SmsMessage): Optional<SmsMessage> {

        return findByIdOptional<SmsMessage>(Id)
    }
}