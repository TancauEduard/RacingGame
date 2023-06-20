package org.eduard;

public class Car extends AutoVehicle{
    /*String name;
    double fuelLevel, mileage, totalTraveledDistance;
    int maxSpeed;
    boolean isDamaged;
    -------------------------> Vehicle */

    // Engine engine; -----> AutoVehicle

    int doorCount;


    public Car(String name, double fuelLevel, double mileage, double totalTraveledDistance,
               int doorCount, int maxSpeed, boolean isDamaged, Engine engine) {
        this.name = name;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
        this.totalTraveledDistance = totalTraveledDistance;
        this.doorCount = doorCount;
        this.maxSpeed = maxSpeed;
        this.isDamaged = isDamaged;
        this.engine = engine;
    }

    public void DisplayProperties()
    {
        System.out.println("Car name: "+ name);
        System.out.println("Car fuel level: "+ fuelLevel);
        System.out.println("Car mileage: "+mileage);
        System.out.println("Total distance traveled by car: " + totalTraveledDistance);
        System.out.println("Car doors: " + doorCount);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Is damaged: " + isDamaged);
        engine.DisplayProperties();
    }
}
