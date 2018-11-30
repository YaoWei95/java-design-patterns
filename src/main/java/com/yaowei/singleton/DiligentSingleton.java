package com.yaowei.singleton;

import org.jetbrains.annotations.Contract;

/**
 * @author yaowei
 */
public class DiligentSingleton {

    private DiligentSingleton() {
    }

    private static final DiligentSingleton INSTANCE = new DiligentSingleton();

    @Contract(pure = true)
    public static DiligentSingleton getInstance() {
        return INSTANCE;
    }

}
