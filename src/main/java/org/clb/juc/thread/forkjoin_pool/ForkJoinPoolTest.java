package org.clb.juc.thread.forkjoin_pool;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @Description
 * @Classname ForkJoinPoolTest
 * @Date 2021/6/5 14:14
 * @Author clb
 */
public class ForkJoinPoolTest {

    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool fk=new ForkJoinPool();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(1);
        }
        MyTask myTask = new MyTask(list, 0, 1000);
        Integer invoke = fk.invoke(myTask);
        fk.shutdown();
        System.out.println(invoke);
    }
    @Data
    static class MyTask extends RecursiveTask<Integer> {

        private List<Integer> list;
        private Integer from;
        private Integer to;

        public MyTask(List<Integer> list, Integer from, Integer to) {
            this.list = list;
            this.from = from;
            this.to = to;
        }

        @Override
        protected Integer compute() {
            if (to-from<10) {
                Integer integer = list.subList(from, to).stream().reduce((a, b) -> a + b).get();
                System.out.println("form"+from+"to"+to +"sum"+integer);
                return integer;
            } else {
                int middle = (from + to) / 2;
                MyTask leftTask = new MyTask(list, from, middle);
                MyTask rightTask = new MyTask(list, middle, to);
                leftTask.fork();
                rightTask.fork();
                return leftTask.join()+rightTask.join();
            }
        }
    }

}
