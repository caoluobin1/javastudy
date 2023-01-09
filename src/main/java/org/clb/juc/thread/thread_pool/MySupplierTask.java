package org.clb.juc.thread.thread_pool;

import lombok.Data;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

@Data
public class MySupplierTask implements Supplier {
    private String token;
    private Callable callable;
    public MySupplierTask(String token) {
        this.token = token;
    }

    public MySupplierTask(String token, Callable callable) {
        this.token = token;
        this.callable = callable;
    }

    @Override
    public Object get() {
        try {
            return callable.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
