package com.dv.design.patterns.creational.abstractfactory;

public class LuxuryCar extends Car {

    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
        buildCar();
    }

    @Override
    public void buildCar() {
        System.out.println("Building car "+getModel() +" at "+getLocation());
    }
}
