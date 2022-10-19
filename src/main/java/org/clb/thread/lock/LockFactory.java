package org.clb.thread.lock;

public interface LockFactory {
    public Lock getLock(String key);
}
