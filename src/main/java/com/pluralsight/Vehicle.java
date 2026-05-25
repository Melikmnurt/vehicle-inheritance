package com.pluralsight;

// Parent class for all vehicle types
public class Vehicle {

    // The color of the vehicle
    private String color;

    // Number of passengers the vehicle can hold
    private int numberOfPassengers;

    // Maximum cargo capacity
    private int cargoCapacity;

    // Fuel tank capacity
    private int fuelCapacity;

    // Constructor for Vehicle
    public Vehicle(String color, int numberOfPassengers,
                   int cargoCapacity, int fuelCapacity) {

        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for number of passengers
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    // Setter for number of passengers
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    // Getter for cargo capacity
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    // Setter for cargo capacity
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // Getter for fuel capacity
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    // Setter for fuel capacity
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}