package com.hazelcast.springboot.caching;

import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    HazelcastInstance hazelcastInstance;

    @Cacheable(cacheNames = {"#isbn", "#name"})
    public User getBookNameByIsbn(String isbn, String name) {

        return findBookInSlowSource(isbn, name);
    }

    private User findBookInSlowSource(String isbn, String name) {
        // some long processing
        System.out.println(hazelcastInstance.getMap(hazelcastInstance.getName()));
        System.out.println("Processing" + isbn + "----------" + name);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new User("5", "3amer");
    }
}
