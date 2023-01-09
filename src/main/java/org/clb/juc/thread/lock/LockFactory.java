package org.clb.juc.thread.lock;

public interface LockFactory {
    public Lock getLock(String key);
}
