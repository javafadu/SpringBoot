package main;

import service.MailService;
import service.MessageService;

public class MyApplication {

	public static void main(String[] args) {

		// interface kullandigimiz icin yeni bir mesaj servise gecis
		// yapmak cok kolaylasti
		
		// fakat hala hedef MessageService kullanmak icin concrete sinif
		// ismini degistirmek gerekiyor
		// bu asagidaki kod orneginde eger yeni bir Service kullanmak istersek
		// MailService() yazan yeri degistirmemiz gerekiyor. Hala hard coded
		
		// Eger bir config dosyasi olsaydi kolayca degisikik yapilabilirdi.
		
		MessageService theService = new MailService();
		System.out.println(theService.sendMessage());
		
		
		
		
	}

}
