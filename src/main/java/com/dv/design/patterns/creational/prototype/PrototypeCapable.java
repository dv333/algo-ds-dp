package com.dv.design.patterns.creational.prototype;

public interface PrototypeCapable  extends Cloneable{

    public PrototypeCapable clone() throws CloneNotSupportedException;
}
