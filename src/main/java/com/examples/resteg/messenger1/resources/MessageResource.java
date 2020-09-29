package com.examples.resteg.messenger1.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.examples.resteg.messenger1.model.Message;
import com.examples.resteg.messenger1.service.MessageService;

@Path("/messages")
public class MessageResource {

	
	MessageService messageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
}
