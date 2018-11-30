package com.yaowei.singleton;

/**
 * @author yaowei
 */
public class ThreadSafeLazyLoadSingleton {
    private static volatile ThreadSafeLazyLoadSingleton instance = null;

    public static ThreadSafeLazyLoadSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeLazyLoadSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeLazyLoadSingleton();
                }
            }
        }

        return instance;
    }

    private ThreadSafeLazyLoadSingleton() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }
}
