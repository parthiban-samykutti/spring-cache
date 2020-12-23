package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringCacheApplication implements CommandLineRunner{
	@Autowired
	private AccountService accountService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCacheApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Going to retrieve accountTypes.....");
		System.out.println("Received account types1: "+accountService.getAccountTypes());
		System.out.println("Received account types2: "+accountService.getAccountTypes());
		System.out.println("Received account types3: "+accountService.getAccountTypes());
		System.out.println("Sleeping.....");
		Thread.sleep(17000);
		System.out.println("Awake from Sleep.....");
		System.out.println("Received account types4: "+accountService.getAccountTypes());
		System.out.println("Received account types5: "+accountService.getAccountTypes());
		System.exit(0);
	}

}
