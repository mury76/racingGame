package org.fasttrackit;

public class Roket extends AutoVehicle {

    private int doorCount;

    public double accelerate(double speed, double time) {
        System.out.println("Vehicle " + getName() + " accelerates with " + speed + " for " + time + " seconds.");
        double travelDistance = speed * (time*2);
        System.out.println("Traveled distance: " + travelDistance);
        return travelDistance;
    }


    public Roket(String name) {
        super(name);
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
