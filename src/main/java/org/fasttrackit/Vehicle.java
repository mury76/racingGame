package org.fasttrackit;

public class Vehicle {

    private String name;
    private String color;
    private double mileage;
    private double fuelLevel;

    // demonstrating constants
    public final static String RADIO_CONTROL = "Radio Control";

    public Vehicle (String name) {
        this.name = name;
    }

    // override method.
    public double accelerate(double speed) {
        return accelerate(speed, 60);
    }

    public double accelerate(double speed, double time) {
        System.out.println("\n" + "Vehicle " + name + " accelerates with " + speed + " for " + time + " seconds.");
        double travelDistance = speed * time;
        travelDistance = Math.round(travelDistance * 100.0)/100.0;
        System.out.println("Traveled distance: " + travelDistance);
        checkFuel(travelDistance, mileage);

        double consumedFuel = mileage * travelDistance / 100;
//    fuelLevel = fuelLevel - consumedFuel;
        fuelLevel -= consumedFuel;

        return travelDistance;
    }

    public double checkFuel(double travelDistance, double mileage) {
        double consum = travelDistance * mileage;
        System.out.println("The vehicle consumed a total of: " + consum + " Liters.");
        return consum;

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

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}

