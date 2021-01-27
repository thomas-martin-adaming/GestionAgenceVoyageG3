package com.mcustomer;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.mcustomer.entities.Customer;
import com.mcustomer.repositories.CustomerRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceCustomerApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCustomerApplication.class, args);
	}
//	@Bean
//	CommandLineRunner start(CustomerRepository customerRepository) {
//		return (args) -> {
//			Stream.of(new Customer("TOURNESOL", "Tryphon-Tournesol@mail.com", 0735353637)).forEach((c) -> {
//						customerRepository.save(c);
//						});
//		};
//	}

}
