package org.clb;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        whenCompleteTest();
//        thenApplyTest();
//        thenComposeTest();
//        System.out.println(advanceProbe(1));
//        System.out.println(10>>1);
//        System.out.println(10>>>1);
//        System.out.println(-10>>1);
//        System.out.println(-10>>>1);
        System.out.println(0x61c88647);
        Thread thread = new Thread();

    }
    static final int advanceProbe(int probe) {
        probe ^= probe << 13;   // 0000000000001   100000000001
        probe ^= probe >>> 17; //100000000001
        probe ^= probe << 5;
        return probe;
    }

    public void test(Thread thread) {

    }


    public static void test1() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> a = CompletableFuture.runAsync(() -> {
            System.out.println("a执行");
        });//异步运行 不抛出异常
        CompletableFuture<String> g = CompletableFuture.supplyAsync(() -> {
            System.out.println("b执行");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "aaaa";
        });
        System.out.println(g.join());//阻塞获取结果  不需要处理异常
        System.out.println(g.get());//阻塞获取结果   需要处理ExecutionException, InterruptedException异常
    }
    public static void whenCompleteTest() throws InterruptedException {
        CompletableFuture<Void> a = CompletableFuture.runAsync(() -> {
            System.out.println("a执行");
            int c =1/0;
        });
        CompletableFuture<String> g = CompletableFuture.supplyAsync(() -> {
            System.out.println("b执行");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "aaaa";
        });
        a.whenComplete((result,exception)->{
            System.out.println(exception.getMessage());
            System.out.println(result);
        });//异步非阻塞
        g.whenComplete((result,exception)->{
            System.out.println(result);
        });//异步非阻塞
        TimeUnit.SECONDS.sleep(2);
    }
    public static void thenApplyTest() {
        CompletableFuture<Integer> c = CompletableFuture.supplyAsync(() -> {
            return 111;
        }).thenApply(a -> {
            return a + 10;
        });
        System.out.println(c.join());

    }

    public static void thenComposeTest() {
        CompletableFuture<Integer> c = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 111;
        }).thenCompose(a->CompletableFuture.supplyAsync(() -> {
            return a+1;
        }));//根据第一个任务的结果进行二次计算
        System.out.println("aaaa");
        System.out.println(c.join());

    }
}
