package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.test.config.EhCacheConfiguration;

@SpringBootTest(classes= {EhCacheConfiguration.class, AccountService.class})
class SpringCacheApplicationTests {

	@Autowired
	private AccountService accountService;
	
	@Test
	void testGetAccountTypes() throws InterruptedException {

		System.out.println("Going to retrieve accountTypes.....");
		System.out.println("Received account types1: "+accountService.getAccountTypes());
		System.out.println("Received account types2: "+accountService.getAccountTypes());
		System.out.println("Received account types3: "+accountService.getAccountTypes());
		System.out.println("Sleeping.....");
		Thread.sleep(17000);
		System.out.println("Awake from Sleep.....");
		System.out.println("Received account types4: "+accountService.getAccountTypes());
		System.out.println("Received account types5: "+accountService.getAccountTypes());
	
	}

}
