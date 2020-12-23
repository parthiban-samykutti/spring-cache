package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class AccountService {
	@Cacheable(cacheNames = {"accountTypes"}, key="#root.methodName")
	public List<String> getAccountTypes(){
		System.out.println("In getAccountTypes");
		List<String> list = new ArrayList<String>();
		list.add("saving");
		list.add("checking");
		list.add("creditcard");
		list.add("personalloan");
		list.add("mortgage");
		return list;
	}
}
