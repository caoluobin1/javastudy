package org.clb.thread.threadLocal;

import org.clb.pojo.User;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyEntry extends WeakReference<ThreadLocal<?>> {

    Object value;

    MyEntry(ThreadLocal<?> k, Object v) {
        super(k);
        value = v;
    }

    public static void main(String[] args) throws InterruptedException {
        weakReferenceTest();
    }

    public static void weakTest() {
        User user = User.getDefaultUser();
        WeakReference reference = new WeakReference(user);
        System.gc();
        int a = 0;
        List<User> list = new ArrayList<>();
        while (true) {
            if (reference.get() != null) {
//                System.out.println(reference.get());
            } else {
                System.out.println("结束====>" + a);
                break;
            }
            list.add(User.getDefaultUser());
            a++;
//            TimeUnit.SECONDS.sleep(1);
//            System.gc();
        }
    }

    public static void weakReferenceTest() {
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        MyEntry[] entries = new MyEntry[4];
        entries[0] = new MyEntry(threadLocal, 10);
        System.gc();
        MyEntry entry = entries[0];
        List<User> list = new ArrayList<>();
        int a = 0;
        while (true) {
            if (entry.get() == null) {
//                System.out.println(entry.get());
                System.out.println("entry key=" + entry.get() + " value=" + entry.value);
//                System.out.println(threadLocal);
                break;
            }
            //通过一直add触发gc
            list.add(User.getDefaultUser());
            System.out.println(a++);
        }
    }
}
