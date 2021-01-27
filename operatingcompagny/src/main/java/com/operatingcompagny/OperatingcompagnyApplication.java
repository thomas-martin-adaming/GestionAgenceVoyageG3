package com.operatingcompagny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.operatingcompagny.repository.OperatingCompagnyRepository;
import com.operatingcompagny.entities.OperatingCompagny;

@SpringBootApplication
@EnableDiscoveryClient 

public class OperatingcompagnyApplication implements CommandLineRunner {

	@Autowired      
	private OperatingCompagnyRepository operatingCompagnyRepository;

	public static void main(String[] args) {
		SpringApplication.run(OperatingcompagnyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
			operatingCompagnyRepository.save(new OperatingCompagny("Air France","Appareil A350 vol direct"));
			operatingCompagnyRepository.save(new OperatingCompagny("American Airlines","Appareil B777 vol direct"));
			operatingCompagnyRepository.save(new OperatingCompagny("Luftansa","Appareil A320 vol direct"));
			
			operatingCompagnyRepository.findAll().forEach(c->{System.out.println(c.getOperatingCompagnyName());});
	}

}
