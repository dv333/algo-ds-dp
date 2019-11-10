package com.dv.design.patterns.creational.abstractfactory;

public class SedanCar extends Car {

    public SedanCar(Location location) {
        super(CarType.SEDAN, location);
        buildCar();
    }

    @Override
    public void buildCar() {
        System.out.println("Building car "+getModel() +" at "+getLocation());
    }
}
