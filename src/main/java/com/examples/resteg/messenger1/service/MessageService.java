package com.examples.resteg.messenger1.service;

import java.util.ArrayList;
import java.util.List;

import com.examples.resteg.messenger1.model.Message;

public class MessageService {

	
	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1L,"HEllo there", "AKanksha");
		Message m2 = new Message(1L,"hi everyone", "Priya");
		List<Message> list= new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}
}
