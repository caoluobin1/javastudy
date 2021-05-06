package org.clb.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static final String AA="asd";
    static int ctlOf(int rs, int wc) { return rs | wc; }
    private final AtomicInteger ctl = new AtomicInteger(RUNNING);
    private static final int RUNNING    = -1 << 29;


    public static void main(String[] args) throws Exception{
//        System.out.println(RUNNING);
//
//         final AtomicInteger ctl = new AtomicInteger(ctlOf(RUNNING, 0));
//        System.out.println(ctl.get());
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2,
                0L, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 7; i++) {
            int finalI = i;
            threadPoolExecutor.submit(()->{
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(finalI);
            });
        }
//        Thread.sleep(100);
        threadPoolExecutor.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        threadPoolExecutor.submit(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        });
        threadPoolExecutor.shutdown();
    }
//    new Thread(()->{
//
//    }).start();
//        new Thread(()->{
//        for (int i = listField.size()/3+1; i < listField.size()*2/3+1; i++) {
//            String returnValue="";
//            for (int j = 1; j < 4 ; j++) {
//                FieldList field = jdbcTemplate.queryField(QUERY_SQL, new Object[]{
//                        listField.get(i).get("node_pid"), listField.get(i).get("fk_yl_yljg"), j
//                });
//
//                returnValue = returnValue + field.get("name");
//                if (j < 3) {
//                    returnValue = returnValue + "-";
//                }
//            }
//            jdbcTemplate.executeUpdate(UPDATE_SQL,new Object[]{
//                    returnValue,  listField.get(i).get("pk_yl_yljg_bed")
//            });
//
//        }
//    }).start();
//        new Thread(()->{
//        for (int i = listField.size()*2/3+1; i < listField.size(); i++) {
//            String returnValue="";
//            for (int j = 1; j < 4 ; j++) {
//                FieldList field = jdbcTemplate.queryField(QUERY_SQL, new Object[]{
//                        listField.get(i).get("node_pid"), listField.get(i).get("fk_yl_yljg"), j
//                });
//
//                returnValue = returnValue + field.get("name");
//                if (j < 3) {
//                    returnValue = returnValue + "-";
//                }
//            }
//            jdbcTemplate.executeUpdate(UPDATE_SQL,new Object[]{
//                    returnValue,  listField.get(i).get("pk_yl_yljg_bed")
//            });
//
//        }
//    }).start();

}
