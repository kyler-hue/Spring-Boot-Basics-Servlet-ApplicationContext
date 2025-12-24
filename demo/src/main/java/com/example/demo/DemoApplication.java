package com.example.demo;

import com.example.demo.root.RootConfig;
import com.example.demo.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		SpringApplication app = new SpringApplication(DemoApplication.class);

		// Create ROOT (parent) context
		app.addInitializers(ctx -> {
			System.out.println("************** "+ctx.getClass()+" **************");
			ctx.setParent(
					new org.springframework.context.annotation.AnnotationConfigApplicationContext(
							RootConfig.class
					)
			);
		});

		app.run(args);
	}

}
