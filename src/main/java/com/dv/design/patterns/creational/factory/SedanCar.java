package com.dv.design.patterns.creational.factory;

public class SedanCar extends Car{

    public SedanCar(CarType type) {
        super(type);
        buildCar();
    }

    @Override
    public void buildCar() {
        System.out.println("Building Sedan Car");
    }
}
