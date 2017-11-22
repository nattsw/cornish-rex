package io.natalietay.conways;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConwaysApplication implements CommandLineRunner {

	@Autowired
	GridPrinter gridPrinter;

	public static void main(String[] args) {
		SpringApplication.run(ConwaysApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("\033[H\033[2J");
		System.out.print(gridPrinter.getGrid(10));
		if (args.length > 0 && args[0].equals("exitcode")) {
			throw new Exception();
		}
	}
}
