package com.javabrains.SpringWithJersey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.javabrains.SpringWithJersey.config.SpringBean;

@SpringBootApplication
@Import(SpringBean.class)
public class SpringWithJerseyApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringWithJerseyApplication.class, args);
	}

}
