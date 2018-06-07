package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    public static final int INITIAL_FUEL_LEVEL = 300;
    public static final int LOWER_MILEAGE_BOUND = 3;
    public static final int UPPER_MILEAGE_BOUND = 15;
    private Vehicle[] competitors = new Vehicle[4];
    private List<Vehicle> competitorList = new ArrayList<>();



    private Car firstCompetitor;
    private Car secondCompetitor;
    private Car thirdCompetitor;
    private Roket forthCompetitor;

    public void start() {
        initCompetitors();

    }
//        Car car1 = new Car("Dacia");
//        car1.setColor("red");
//        car1.setDoorCount(3);
//        car1.setMileage(7.5);
//        car1.setFuelLevel(50);
//
//        Engine engine1 = new Engine();
//        engine1.setManufacturer("Renault");
//
//        car1.setEngine(engine1);
//
//        Car car2 = new Car("Ford");
//        car2.setColor("black");
//        car2.setDoorCount(2);
//        car2.setMileage(8.2);
//        car2.setFuelLevel(47);
//
//        Engine engine2 = new Engine();
//        engine2.setManufacturer("Ford");
//
//        car2.setEngine(engine2);
//
//        Car car3 = new Car("Tesla");
//        car3.setColor("White");
//        car3.setDoorCount(2);
//        car3.setMileage(3.2);
//        car3.setFuelLevel(77);
//
//        Engine engine3 = new Engine();
//        engine3.setManufacturer("Tesla");
//
//        car3.setEngine(engine3);
//
//        Roket roket = new Roket("Rocket");
//        roket.setColor("Black");
//        roket.setDoorCount(2);
//        roket.setMileage(3.2);
//        roket.setFuelLevel(77);
//
//        Engine engine4 = new Engine();
//        engine4.setManufacturer("Mury");
//
//        roket.setEngine(engine4);
//
//        competitors[0] = car1;
//        competitors[1] = car2;
//        competitors[2] = car3;
//        competitors[3] = roket;
//
//        competitorList.add(car1);
//        competitorList.add(car2);
//        competitorList.add(car3);
//        competitorList.add(roket);
//
//        // for loop (Arrays)
//        for (int i = 0; i < competitors.length; i++) {
//            System.out.println("Iteration number: " + i);
//            System.out.println(competitors[i] + "\n");
//            competitors[i].accelerate(8, 9);
//
//        // enhanced for (Arrays)
//        for (Vehicle vehicle : competitors) {
//            System.out.println(vehicle);
//        }
//
//        // for loop (Lists)
//        for (int j = 0; j < competitorList.size(); j++) {
//                System.out.println(competitorList.get(j));
//            }
//
//        // enhanced for (Lists)
//        for (Vehicle fdsajfas : competitorList) {
//                System.out.println(fdsajfas);
//            }
//
//        }
//
//        firstCompetitor = car1;
//        secondCompetitor = car2;
//        thirdCompetitor = car3;
//        forthCompetitor = roket;
//
//        car1.accelerate(7.2, 6.9);
//        car2.accelerate(6.5, 7.3);
//        car3.accelerate(9.5, 6.3);
//        roket.accelerate(9.3, 6.3);
//
//    }
//
    private void initCompetitors() {
        System.out.println("Enter number of players.");

        int playerNumber = readAndCheckInt();


        System.out.println("Starting game with " + playerNumber + " players.");

        for (int i = 1; i <= playerNumber; i++) {

            System.out.println("Enter car name for player" + i);
            Scanner nameScanner = new Scanner(System.in);
            String name = nameScanner.nextLine();

            System.out.println("Enter car color for player" + i);
            Scanner colorScanner = new Scanner(System.in);
            String color = colorScanner.nextLine();

            Vehicle vehicle = new Car(name);
            vehicle.setColor(color);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(LOWER_MILEAGE_BOUND, UPPER_MILEAGE_BOUND));
            vehicle.setFuelLevel(INITIAL_FUEL_LEVEL);

            System.out.println("Vehicle for player " + ": " + vehicle + ".");

            competitorList.add(vehicle);



        }
    }

    private int readAndCheckInt() {
        Scanner scanner1 = new Scanner(System.in);
        int number;

        try {
            number = scanner1.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer!");
            number = readAndCheckInt();
        }
        return number;
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

    public Car getThirdCompetitor() {
        return thirdCompetitor;
    }

    public void setThirdCompetitor(Car thirdCompetitor) {
        this.thirdCompetitor = thirdCompetitor;
    }

    public Roket getForthCompetitor() {
        return forthCompetitor;
    }

    public void setForthCompetitor(Roket forthCompetitor) {
        this.forthCompetitor = forthCompetitor;
    }
}
