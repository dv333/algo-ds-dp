package com.dv.design.patterns.factory;

public abstract class Car {

    private CarType model = null;
    public Car(CarType type) {
        model =type;
    }

    public abstract void buildCar();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
