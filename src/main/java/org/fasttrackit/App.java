package org.fasttrackit;

public class App {
    public static void main(String[] args) {
        Game game = new Game();

        Car car1 = new Car();
        car1.name = "Dacia";
        car1.color = "red";
        car1.doorCount = 3;
        car1.mileage = 7.5;
        car1.fuelLevel = 50;

        Engine engine1 = new Engine();
        engine1.manufacturer = "Renault";

        car1.engine = engine1;


        Car car2 = new Car();
        car2.name = "Ford";
        car2.color = "black";
        car2.doorCount = 2;
        car2.mileage = 8.2;
        car2.fuelLevel = 47;

        Engine engine2 = new Engine();
        engine2.manufacturer = "Ford";

        car2.engine = engine2;

        game.firstCompetitor = car1;
        game.secondCompetitor = car2;

    }
}
