package com.example.contacttenantmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = {LiquibaseAutoConfiguration.class })
public class ContactTenantMgmtApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ContactTenantMgmtApplication.class, args);
	}

}
