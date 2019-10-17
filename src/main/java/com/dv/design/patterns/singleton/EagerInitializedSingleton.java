package com.dv.design.patterns.singleton;

public class EagerInitializedSingleton {
    // Note the volatile variable or mark it as final
    private static volatile EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){
    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
