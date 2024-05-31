package lk.ijse.GDSE65.HelloShoes;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"lk.ijse.GDSE65.HelloShoes.*"})
public class HelloShoesApplication {
	@Bean
	ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloShoesApplication.class, args);
	}

}
