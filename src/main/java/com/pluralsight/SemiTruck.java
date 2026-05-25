package com.pluralsight;

// SemiTruck inherits from Vehicle
public class SemiTruck extends Vehicle {

    // Constructor for SemiTruck
    public SemiTruck(String color, int numberOfPassengers,
                     int cargoCapacity, int fuelCapacity) {

        // Call parent constructor
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }
}