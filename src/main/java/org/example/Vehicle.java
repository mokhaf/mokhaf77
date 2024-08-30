package org.example;

public class Vehicle {

    //variables
    private int numberOfWheels;
    private float engineSize;
    private String color;
    private String fuelType;

    //constructor method
    public Vehicle(int numberOfWheels, float engineSize, String color, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.engineSize = engineSize;
        this.color = color;
        this.fuelType = fuelType;
    }

    //getter method for variable, numberOfWheels
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    //setter method for variable, numberOfWheels
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    //getter method for variable, engineSize
    public float getEngineSize() {
        return engineSize;
    }

    //setter method for variable, engineSize
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    //getter method for variable, color
    public String getColor() {
        return color;
    }

    //setter method for variable, color
    public void setColor(String color) {
        this.color = color;
    }

    //getter method for variable, fuelType
    public String getFuelType() {
        return fuelType;
    }

    //setter method for variable, fuelType
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

}
