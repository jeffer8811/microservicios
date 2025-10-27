package com.microservicios.academico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AcademicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademicoApplication.class, args);
	}

}
