package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    private Engine engine;

    public AutoVehicle(String name) {
        super(name);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
