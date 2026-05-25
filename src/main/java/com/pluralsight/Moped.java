package com.pluralsight;

// Moped inherits from Vehicle
public class Moped extends Vehicle {

    // Constructor for Moped
    public Moped(String color, int numberOfPassengers,
                 int cargoCapacity, int fuelCapacity) {

        // Call parent constructor
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }
}