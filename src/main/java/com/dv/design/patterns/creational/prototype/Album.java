package com.dv.design.patterns.creational.prototype;

public class Album implements PrototypeCapable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("Cloning Album");
        return (PrototypeCapable) super.clone();
    }

    {
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                '}';
    }
}
