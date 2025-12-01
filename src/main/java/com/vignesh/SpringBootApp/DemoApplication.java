package com.vignesh.SpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// import com.vignesh.SpringBootApp.model.Alien;
import com.vignesh.SpringBootApp.model.Laptop;
import com.vignesh.SpringBootApp.service.LaptopService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

		// Alien obj = context.getBean(Alien.class);
		// obj.code();
	}

}
