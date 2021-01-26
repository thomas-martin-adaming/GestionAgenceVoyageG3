package com.mjourney;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
//@EnableDiscoveryClient
@RestController
public class MicroserviceJourneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceJourneyApplication.class, args);
	}
/*	@Bean
	CommandLineRunner start(VolRepository volRepository) {
		return (args) -> {
			Stream.of(new Vol("Madrid", "Vol pour Madrid"), new Vol("Paris", "Vol pour Paris"),
					new Vol("New-York", "Vol pour New-York"), new Vol("Sao-Paulo", "Vol pour Sao-Paulo"),
					new Vol("London", "Vol pour London")).forEach((v) -> {
						volRepository.save(v);
					});

		};
	}*/

}
