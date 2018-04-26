package com.bankinfo.BankInformation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.bankinfo.BankInformation" })
@EnableAutoConfiguration
public class BankInformationApp {

	public static void main(final String[] args) {
		SpringApplication.run(BankInformationApp.class, args);
	}
}