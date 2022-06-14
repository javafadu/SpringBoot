package service;

public class SmsService implements MessageService {

	@Override
	public String sendMessage() {
		return "I am an SMS Service, i sent an SMS";
	}

}
