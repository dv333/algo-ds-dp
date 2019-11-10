package com.dv.design.patterns.creational.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton _INSTANCE =null;

    static {
        _INSTANCE = new StaticBlockSingleton();
    }

    private StaticBlockSingleton(){
    }
    public static StaticBlockSingleton getInstance() {
        return _INSTANCE;
    }

}
