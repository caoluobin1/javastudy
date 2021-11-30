package org.clb.guava.cache;


import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.clb.pojo.User;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CacheTest {

    public static void main(String[] args) {
                LoadingCache<String, User> cache = CacheBuilder.newBuilder().maximumSize(1000).expireAfterWrite(5, TimeUnit.SECONDS).build(new CacheLoader<String, User>() {
                    public User load(String key) throws Exception {
                        System.out.println("aaa");
                        return new User("1", "cao", "1", 1);
                    }
                });
        Cache<String, User> cache2 = CacheBuilder.newBuilder().maximumSize(1000).expireAfterWrite(5, TimeUnit.SECONDS).build();
                try {
                    User us = new User("2", "cao2", "2", 2);
                    cache2.put("b", us);
                    User b = cache2.get("b", () -> {
                        return new User("3", "cao", "3", 3);
                    });
                    System.out.println(b);
                    Thread.sleep(6000);
                    b = cache2.get("b", () -> {
                        return new User("3", "cao", "3", 3);
                    });
                    System.out.println(b);
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    }
}
