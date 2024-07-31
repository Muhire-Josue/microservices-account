package com.eazybytes.account;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservices REST API Documentation.",
				description = "This is a service that deals with account features.",
				version = "v1",
				contact = @Contact(
						name = " John Doe",
						email = "example@gmail.com",
						url = "github.com/Muhire-Josue"
				),
				license = @License(
						name = "MIT",
						url = "github.com/Muhire-Josue"
				)
		)
)
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

}
