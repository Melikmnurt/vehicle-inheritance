package com.pluralsight;

public class MainApp {

    public static void main(String[] args) {

        // Create a Moped object
        Moped slowRide = new Moped("Red", 1, 10, 5);

        // Create a Car object
        Car familyCar = new Car("Blue", 5, 25, 15);

        // Create a SemiTruck object
        SemiTruck bigRig = new SemiTruck("White", 2, 5000, 120);

        // Create a Hovercraft object
        Hovercraft hovercraft = new Hovercraft("Silver", 8, 1000, 60);

        // Display Moped information
        System.out.println("Moped Information");
        System.out.println("Color: " + slowRide.getColor());
        System.out.println("Fuel Capacity: " + slowRide.getFuelCapacity());
        System.out.println();

        // Display Car information
        System.out.println("Car Information");
        System.out.println("Color: " + familyCar.getColor());
        System.out.println("Passengers: " + familyCar.getNumberOfPassengers());
        System.out.println();

        // Display SemiTruck information
        System.out.println("SemiTruck Information");
        System.out.println("Color: " + bigRig.getColor());
        System.out.println("Cargo Capacity: " + bigRig.getCargoCapacity());
        System.out.println();

        // Display Hovercraft information
        System.out.println("Hovercraft Information");
        System.out.println("Color: " + hovercraft.getColor());
        System.out.println("Fuel Capacity: " + hovercraft.getFuelCapacity());
    }
}