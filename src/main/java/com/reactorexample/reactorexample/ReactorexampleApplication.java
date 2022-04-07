package com.reactorexample.reactorexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactorexampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReactorexampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var stream = Flux.just("hola","que");

	}
}
