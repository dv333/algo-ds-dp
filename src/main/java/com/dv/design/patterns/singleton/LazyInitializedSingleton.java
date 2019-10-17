package com.dv.design.patterns.singleton;

public class LazyInitializedSingleton {
    // Note the volatile variable
    private static volatile LazyInitializedSingleton _INSTANCE;

    private LazyInitializedSingleton(){
    }

    public static LazyInitializedSingleton getInstance(){
        if(_INSTANCE == null) {
            _INSTANCE = new LazyInitializedSingleton();
        }
        return _INSTANCE;
    }

}
