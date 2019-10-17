package com.dv.design.patterns.singleton;

/**
 * Read more here : https://dzone.com/articles/java-singletons-using-enum
 *                :https://howtodoinjava.com/design-patterns/creational/singleton-design-pattern-in-java/
 */
public enum EnumSingleton {
    INSTANCE;

    int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
