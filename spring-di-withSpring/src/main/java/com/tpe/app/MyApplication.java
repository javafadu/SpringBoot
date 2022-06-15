package com.tpe.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tpe.AppConfiguration;
import com.tpe.service.MessageService;
import com.tpe.thirdparty.ThirdPartyComponent;

public class MyApplication {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(AppConfiguration.class);
		
		
		
//      MessageService service = context.getBean("whatsappService",MessageService.class);
//	  System.out.println(service.sentMessage());
		
		
		MessageService  service2= context.getBean("mailService",MessageService.class);
        System.out.println(service2.sentMessage());
		
		
		ThirdPartyComponent thirdPartyComponent =  context.getBean("thirdPartyComponent",ThirdPartyComponent.class);
		System.out.println(thirdPartyComponent.getMessage());
		
		
		context.close();
		
	}

}
