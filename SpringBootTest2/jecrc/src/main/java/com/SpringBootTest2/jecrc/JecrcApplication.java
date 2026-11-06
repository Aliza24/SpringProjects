package com.SpringBootTest2.jecrc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.BasicJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

//@SpringBootConfiguration matches with @Configuration
//@EnableAutoConfiguration = search all beans
@SpringBootApplication
public class JecrcApplication {

	public static void main(String[] args) {
		// 1. Start the context and save the reference
		ApplicationContext context = SpringApplication.run(JecrcApplication.class, args);

		// 2. Fetch the OrderService bean from the context
		OrderService order = context.getBean(OrderService.class);

		// 3. Execute the method
		order.placeOrder();

	}
	@Bean
	public UserService getUserServiceBean()
	{
		return new UserService();
	}
	@Bean
	public JsonParser getJsonParser()
	{
		return new BasicJsonParser();
	}
}