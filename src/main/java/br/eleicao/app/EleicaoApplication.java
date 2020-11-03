package br.eleicao.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EleicaoApplication implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ola mundo");
		
	}

	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}

}
