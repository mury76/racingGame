package org.fasttrackit;

public class Vehicle {

    private String name;
    private String color;
    private double mileage;
    private double fuelLevel;

    public Vehicle (String name) {
        this.name = name;
    }

    public double accelerate(double speed, double time) {
        System.out.println("Vehicle accelerates with " + speed + " for " + time + " seconds.");
        double travelDistance = speed * time;
        System.out.println("Traveled distance: " + travelDistance);
        return travelDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}

