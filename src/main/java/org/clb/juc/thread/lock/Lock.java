package org.clb.juc.thread.lock;

public interface Lock {
    public void lock();

    public void lock(String name);

    public void unlock();

    public void unlock(String name);
}
