package com.senacniteroi.appdecorridas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages = "com.senacniteroi.appdecorridas.controller.AppdecorridasController$AppdecorridasRepository")
public class AppdecorridasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppdecorridasApplication.class, args);
	}

}
