package org.fasttrackit;

public class Roket extends AutoVehicle {

    private int doorCount;

    @Override
    public double accelerate(double speed, double time) {
        System.out.println("\n" + "Vehicle " + getName() + " accelerates with " + speed + " for " + time + " seconds.");
        double travelDistance = speed * time;

        travelDistance *= 2;
        // travelDistance = travelDistance * 2;


        travelDistance = Math.round(travelDistance * 100.0)/100.0;

        System.out.println("Traveled distance: " + travelDistance);

        checkFuel(travelDistance, getMileage());

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
