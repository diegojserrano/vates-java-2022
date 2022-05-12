package ar.edu.diego.abmpersonas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@SpringBootApplication
public class AbmpersonasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbmpersonasApplication.class, args);
	}

	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory(){
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("PersonasPU");
		return factoryBean;
	}
}
