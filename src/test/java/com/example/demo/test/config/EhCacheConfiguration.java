package com.example.demo.test.config;

import java.util.Arrays;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class EhCacheConfiguration {

	public EhCacheConfiguration() {
		System.out.println("loading EhCacheConfiguration.");
	}
	
    @Bean
    public CacheManager cacheManager() {
    	final SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("accountTypes")));
        return cacheManager;
    }
}
