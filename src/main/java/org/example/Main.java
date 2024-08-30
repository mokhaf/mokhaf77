package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //creating new Vehicle object
        Vehicle vehicle = new Vehicle(4, 2.0f, "Blue", "Diesel");
        Car car = new Car(4, 4.0f, "Pink", "Diesel", "Ferrari");

        //testing methods from Vehicle class
        System.out.println("Vehicle Info:");
        System.out.println("Number of wheels: " + vehicle.getNumberOfWheels());
        System.out.println("Engine size: " + vehicle.getEngineSize());
        System.out.println("Color: " + vehicle.getColor());
        System.out.println("Fuel type: " + vehicle.getFuelType());

        System.out.println('\n' + "Updated Vehicle Info:");
        vehicle.setNumberOfWheels(6);
        System.out.println("New number of wheels: " + vehicle.getNumberOfWheels());
        vehicle.setEngineSize(4.0f);
        System.out.println("New engine size: " + vehicle.getEngineSize());
        vehicle.setColor("Red");
        System.out.println("New color: " + vehicle.getColor());
        vehicle.setFuelType("Gasoline");
        System.out.println("New fuel type: " + vehicle.getFuelType());

        //testing car methods
        System.out.println('\n' + "Car Info:");
        car.displayInfo();
        car.honk();

        System.out.println('\n' + "Updated Car Info:");
        car.setBrand("Honda");
        System.out.println("New brand: " + car.getBrand());
        car.honk();

    }
}