package com.learncodingrsa.service

import com.learncodingrsa.domain.SmsMessage
import com.learncodingrsa.repository.MessageRepository
import java.util.*
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject

@ApplicationScoped
class MessageService {

    @Inject
    var messageRepository: MessageRepository? = null

    fun getMessage(Id: UUID): SmsMessage? {

        return if (messageRepository != null) messageRepository?.findById(Id) else null

    }
}