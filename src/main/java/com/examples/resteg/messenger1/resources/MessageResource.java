package com.examples.resteg.messenger1.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.examples.resteg.messenger1.model.Message;
import com.examples.resteg.messenger1.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

	
	MessageService messageService = new MessageService();

	@GET
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	
	
	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") long messageId){
		return messageService.getMessage(messageId);
//		return "message id received  " + messageId;
	}
	
	@POST
		public Message addMessage(Message message) {
			return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
		public Message updateMessage(@PathParam("messageId") long messageId , Message message) {
			message.setId(messageId);
			return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	public String deleteMessage(@PathParam("messageId") long messageId){
		 messageService.removeMessage(messageId);
		 return "Message Deleted ";
	}
}
