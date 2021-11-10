package com.nttdata.Spring3Desafio;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import entity.Client;
import services.ClientServiceImpl;


@SpringBootApplication
public class Spring3DesafioApplication implements CommandLineRunner{
	
	@Autowired
	private ClientServiceImpl clienteservicio;

	
	public static void main(String[] args) {
		SpringApplication.run(Spring3DesafioApplication.class, args);
	}	

@Override
		public void run(String... args) throws Exception {	

		Client cliente1 = new Client();
		cliente1.setNombre("Jose");
		cliente1.setPrimerapellido("Portero");
		cliente1.setSegundoapellido("Cabrera");
		cliente1.setDni("50607152A");
		cliente1.setFecha("1980-12-21");
		
		Client cliente2 = new Client();
		cliente1.setNombre("Maria");
		cliente1.setPrimerapellido("Garcia");
		cliente1.setSegundoapellido("Cabrera");
		cliente1.setDni("50607458A");
		cliente1.setFecha("1960-11-21");
		
		clienteservicio.insertNewClient(cliente1);
		clienteservicio.insertNewClient(cliente2);
		
		clienteservicio.searchAllClients();
		clienteservicio.searchByFullName("Jose", "Portero", "Cabrera");
		


	
	}
	
	}	
	

