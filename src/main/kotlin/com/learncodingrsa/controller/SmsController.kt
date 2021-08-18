package com.learncodingrsa.controller

import com.learncodingrsa.domain.SmsMessage
import com.learncodingrsa.service.MessageService
import java.util.*
import javax.inject.Inject
import javax.inject.Named
import javax.transaction.Transactional
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
@Named("customerHandler")
class SmsController {

    @Inject
    var messageService: MessageService? = null

    @GET
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{Id}")
    fun getMessage(@PathParam("Id") Id: UUID): SmsMessage? {
        return if (messageService != null) messageService?.getMessage(Id) else null

    }
}