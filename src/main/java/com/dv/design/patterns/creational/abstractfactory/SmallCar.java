package com.dv.design.patterns.creational.abstractfactory;

public class SmallCar extends Car{

    public SmallCar(Location location) {
        super(CarType.SMALL,location);

        buildCar();
    }

    @Override
    public void buildCar() {
        System.out.println("Building car "+getModel() +" at "+getLocation());
    }
}
