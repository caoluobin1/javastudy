package org.clb.thread.lock;

import org.apache.ibatis.util.MapUtil;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class NameLock implements Lock{
    private ConcurrentHashMap<String, ReentrantLock> lockMap = new ConcurrentHashMap<>();
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void lock() {
        lock.lock();
    }

    @Override
    public void lock(String name) {
        this.lockMap.putIfAbsent(name, new ReentrantLock());
        ReentrantLock lock =lockMap.get(name);
        lock.lock();
    }

    @Override
    public void unlock() {
        lock.unlock();
    }

    @Override
    public void unlock(String name) {
        ReentrantLock lock = this.lockMap.get(name);
        lock.unlock();
    }

}
