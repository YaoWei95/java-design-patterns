package com.yaowei.singleton;

/**
 * @author yaowei
 */
public class LazyLoadSingleton {

    private static LazyLoadSingleton instance = null;

    public static LazyLoadSingleton getInstance() {
        if (instance == null) {
            instance = new LazyLoadSingleton();
        }
        return instance;
    }

    private LazyLoadSingleton() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }
}
