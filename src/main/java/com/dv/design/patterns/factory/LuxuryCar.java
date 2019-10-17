package com.dv.design.patterns.factory;

public class LuxuryCar extends Car {

    public LuxuryCar(CarType type) {
        super(type);
        buildCar();
    }

    @Override
    public void buildCar() {
        System.out.println("Building Luxury Car");
    }
}
