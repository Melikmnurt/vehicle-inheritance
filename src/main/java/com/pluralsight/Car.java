package com.pluralsight;

// Car inherits from Vehicle
public class Car extends Vehicle {

    // Constructor for Car
    public Car(String color, int numberOfPassengers,
               int cargoCapacity, int fuelCapacity) {

        // Call parent constructor
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }
}