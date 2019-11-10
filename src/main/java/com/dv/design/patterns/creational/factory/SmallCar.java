package com.dv.design.patterns.creational.factory;

public class SmallCar extends Car {

    public SmallCar(CarType type) {
        super(type);
        buildCar();
    }

    @Override
    public void buildCar() {
        System.out.println("Building small car");
    }
}
