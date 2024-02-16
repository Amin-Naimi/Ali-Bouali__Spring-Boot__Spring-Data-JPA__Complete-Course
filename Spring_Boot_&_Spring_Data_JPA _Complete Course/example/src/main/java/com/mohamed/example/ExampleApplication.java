package com.mohamed.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		 var context = SpringApplication.run(ExampleApplication.class, args);

		MyFirstClasse myFirstClasse = context.getBean(MyFirstClasse.class);
		System.out.println(myFirstClasse.sayHello());
	}

	@Bean
	public MyFirstClasse myFirstClasse(){
		return new MyFirstClasse();
	}


	/*
	* 		SpringApplication.run(ExampleApplication.class, args);

		MyFirstClasse myFirstClasse = new MyFirstClasse();
		System.out.println(myFirstClasse.sayHello());
	}*/

}
