package com.dv.design.patterns.singleton;

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
