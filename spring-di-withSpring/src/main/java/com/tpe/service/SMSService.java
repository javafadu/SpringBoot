package com.tpe.service;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSService implements MessageService {

	@Override
	public String sentMessage() {
		
		return "I am an SMS Service, i sent an SMS";
	}

}
