package com.dv.design.patterns.creational.singleton;

import java.io.Serializable;

/**
 * Read more here : https://dzone.com/articles/java-singletons-using-enum
 *                :https://howtodoinjava.com/design-patterns/creational/singleton-design-pattern-in-java/
 */
public class BillPughSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private BillPughSingleton(){
    }
    // The lazy inner class will be loaded and initialized only once
    // as per the java memory model
    private static class LazyHolder{
        private static BillPughSingleton _INSTANCE = new BillPughSingleton();
    }

    public static  BillPughSingleton getInstance(){
        return LazyHolder._INSTANCE;
    }

    // For handling deserialization problem
    private Object readResolve(){
        return getInstance();
    }
}
