package com.mindhub.security;

import com.mindhub.security.models.Client;
import com.mindhub.security.repositories.ClientRepository;
import com.mindhub.security.service.ClientService;
import com.mindhub.security.service.impl.ClientServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository){
		return args -> {
//			CREATE
			Client client = new Client( null, "pepito", "123456");
			System.out.println("Antes de la BD: " + client);
			clientRepository.save(client);
			System.out.println("Despues de la BD: " + client);

//			UPDATE
			Client pepito = new Client( 1L, "Franco", "123456");
			clientRepository.save(pepito);
			System.out.println(pepito);

//			DELETE
			clientRepository.delete(client);

//			LIST
//			SET
			List<String> nombres = new ArrayList<>();
			ClientService clientService = new ClientServiceImpl();
		};
	}
}
