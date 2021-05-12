package org.clb.thread;

public class ThreadInterupptTest2 {
    public static void main(String[] args) {
        ThreadInterupptTest2 t2=new ThreadInterupptTest2();
        Thread t=new Thread(()->{
            synchronized (t2){
                try {
                    t2.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("asd");
            }
        });
        t.start();
        t.interrupt();
        System.out.println(t.isInterrupted());
        long now=System.currentTimeMillis();
        while (System.currentTimeMillis()-now<10000){

        }
    }
}
