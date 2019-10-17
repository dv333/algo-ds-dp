package com.dv.design.patterns.prototype;

public interface PrototypeCapable  extends Cloneable{

    public PrototypeCapable clone() throws CloneNotSupportedException;
}
