package org.fasttrackit;

public class Game {
    private Car firstCompetitor;
    private Car secondCompetitor;
    private Car thirdCompetitor;
    private Roket forthCompetitor;

    public void start() {
        Car car1 = new Car("Dacia");
        car1.setColor("red");
        car1.setDoorCount(3);
        car1.setMileage(7.5);
        car1.setFuelLevel(50);

        Engine engine1 = new Engine();
        engine1.setManufacturer("Renault");

        car1.setEngine(engine1);

        Car car2 = new Car("Ford");
        car2.setColor("black");
        car2.setDoorCount(2);
        car2.setMileage(8.2);
        car2.setFuelLevel(47);

        Engine engine2 = new Engine();
        engine2.setManufacturer("Ford");

        car2.setEngine(engine2);

        Car car3 = new Car("Tesla");
        car3.setColor("White");
        car3.setDoorCount(2);
        car3.setMileage(3.2);
        car3.setFuelLevel(77);

        Engine engine3 = new Engine();
        engine3.setManufacturer("Tesla");

        car3.setEngine(engine3);

        Roket roket = new Roket("Rocket");
        roket.setColor("Black");
        roket.setDoorCount(2);
        roket.setMileage(3.2);
        roket.setFuelLevel(77);

        Engine engine4 = new Engine();
        engine4.setManufacturer("Mury");

        roket.setEngine(engine4);

        firstCompetitor = car1;
        secondCompetitor = car2;
        thirdCompetitor = car3;
        forthCompetitor = roket;

        car1.accelerate(7.2, 6.9);
        car2.accelerate(6.5, 7.3);
        car3.accelerate(9.5, 6.3);
        roket.accelerate(9.5, 6.3);




    }

    public Car getFirstCompetitor() {
        return firstCompetitor;
    }

    public void setFirstCompetitor(Car firstCompetitor) {
        this.firstCompetitor = firstCompetitor;
    }

    public Car getSecondCompetitor() {
        return secondCompetitor;
    }

    public void setSecondCompetitor(Car secondCompetitor) {
        this.secondCompetitor = secondCompetitor;
    }
}
