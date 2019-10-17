package com.dv.design.patterns.factory;

/**
 * Refer here: https://howtodoinjava.com/design-patterns/creational/implementing-factory-design-pattern-in-java/
 */
public class CarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;

        switch (model){

            case SMALL:
                    car = new SmallCar(CarType.SMALL);
                    break;
            case SEDAN:
                car = new SedanCar(CarType.SEDAN);
                break;
            case LUXURY:
                car = new LuxuryCar(CarType.LUXURY);
                break;
        }

        return car;
    }
}
