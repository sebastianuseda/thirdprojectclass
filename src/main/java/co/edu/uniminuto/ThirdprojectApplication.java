package co.edu.uniminuto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"co.edu.uniminuto.model"})
@EnableJpaRepositories(basePackages = {"co.edu.uniminuto.dao"})
@ComponentScan(basePackages = {"co.edu.uniminuto.service","co.edu.uniminuto.controller","co.edu.uniminuto.dao"})
public class ThirdprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThirdprojectApplication.class, args);
	}

}
