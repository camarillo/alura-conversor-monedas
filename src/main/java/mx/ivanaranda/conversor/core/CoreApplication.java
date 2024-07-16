package mx.ivanaranda.conversor.core;

import mx.ivanaranda.conversor.core.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.menu();
	}
}
