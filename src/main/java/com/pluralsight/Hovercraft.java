package com.pluralsight;

// Hovercraft inherits from Vehicle
public class Hovercraft extends Vehicle {

    // Constructor for Hovercraft
    public Hovercraft(String color, int numberOfPassengers,
                      int cargoCapacity, int fuelCapacity) {

        // Call parent constructor
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }
}