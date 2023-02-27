package com.senacniteroi.appdecorridas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
public class AppdecorridasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppdecorridasApplication.class, args);
	}

}
