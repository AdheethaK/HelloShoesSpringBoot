package lk.ijse.GDSE65.HelloShoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloShoesApplication {

	public static void main(String[] args) {
		System.out.println("Hello :)");
		SpringApplication.run(HelloShoesApplication.class, args);
	}

}
