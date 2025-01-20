package com.alurachallenge.LiterAlura;

import model.DatosLibro;
import model.Resultado;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import principal.Principal;
import service.ConsumoDeAPI;
import service.ConvierteDatos;

import java.util.stream.Collectors;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.start();


	}
}
