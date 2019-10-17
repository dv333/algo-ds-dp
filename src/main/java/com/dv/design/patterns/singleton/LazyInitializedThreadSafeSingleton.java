package com.dv.design.patterns.singleton;

public class LazyInitializedThreadSafeSingleton {

    // Note the volatile variable
    private static volatile LazyInitializedThreadSafeSingleton _INSTANCE =null;
    private LazyInitializedThreadSafeSingleton(){
    }

    public static synchronized LazyInitializedThreadSafeSingleton getInstance(){
        if(_INSTANCE == null){
            //Sync on .class since it is static
            synchronized (LazyInitializedThreadSafeSingleton.class){
                // Double check here to avoid T1 and T2 pass first check
                if(_INSTANCE == null){
                    _INSTANCE=new LazyInitializedThreadSafeSingleton();
                }
            }
        }
        return _INSTANCE;
    }


}
