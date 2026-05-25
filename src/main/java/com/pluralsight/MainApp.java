package com.pluralsight;

public class MainApp {

    public static void main(String[] args) {

        // Create a Moped object
        Moped slowRide = new Moped();

        // Set values for the moped
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(1);
        slowRide.setCargoCapacity(10);

        // Create a Car object
        Car familyCar = new Car();

        // Set values for the car
        familyCar.setColor("Blue");
        familyCar.setFuelCapacity(15);
        familyCar.setNumberOfPassengers(5);
        familyCar.setCargoCapacity(25);

        // Create a SemiTruck object
        SemiTruck bigRig = new SemiTruck();

        // Set values for the semi truck
        bigRig.setColor("White");
        bigRig.setFuelCapacity(120);
        bigRig.setNumberOfPassengers(2);
        bigRig.setCargoCapacity(5000);

        // Create a Hovercraft object
        Hovercraft hovercraft = new Hovercraft();

        // Set values for the hovercraft
        hovercraft.setColor("Silver");
        hovercraft.setFuelCapacity(60);
        hovercraft.setNumberOfPassengers(8);
        hovercraft.setCargoCapacity(1000);

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