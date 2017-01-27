package com.liferay.home.core.com.liferay.home.core;

import com.liferay.home.core.model.SensorData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackageClasses = SensorData.class)
public class Application {

	public static void main(String[] args) {
		System.out.println("\n\n##### STARTED #####\n\n");

		SpringApplication.run(Application.class, args);
	}

}
