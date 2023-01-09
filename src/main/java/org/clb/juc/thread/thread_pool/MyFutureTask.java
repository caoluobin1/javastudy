package org.clb.juc.thread.thread_pool;

import lombok.Data;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

@Data
public class MyFutureTask extends FutureTask {
    private String token;
    public MyFutureTask(Callable callable) {
        super(callable);
    }

    public MyFutureTask(Runnable runnable, Object result, String token) {
        super(runnable, result);
        this.token = token;
    }




}
