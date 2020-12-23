package com.example.demo;

import java.text.MessageFormat;
import java.util.List;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;


public class AccountTypesCacheListener  implements CacheEventListener<String, List<String>> {
    @Override
    public void onEvent(CacheEvent<? extends String, ? extends List<String>> cacheEvent) {
        System.out.println(MessageFormat.format(
        		"Event {0} fired for key {1} with value {2}", cacheEvent.getType(), cacheEvent.getKey(), cacheEvent.getNewValue()));
    }

}
