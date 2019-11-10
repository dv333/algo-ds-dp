package com.dv.design.patterns.creational.abstractfactory;

public class Test {

    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL, Location.ASIA));
        System.out.println(CarFactory.buildCar(CarType.SEDAN, Location.ASIA));
        System.out.println(CarFactory.buildCar(CarType.LUXURY, Location.USA));
    }
}
