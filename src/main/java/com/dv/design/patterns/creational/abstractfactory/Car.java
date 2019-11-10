package com.dv.design.patterns.creational.abstractfactory;

public abstract  class Car {

    private CarType model;
    private Location location;
    public Car(CarType type, Location location ) {
        this.model=type;
        this.location = location;
    }

    public abstract void buildCar();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
