package com.vehicle;

public class ElectricCar extends Car {
    private double batteryLevel; // Battery level as a percentage (0.0 to 100.0)

    public void setBatteryLevel(double battery) {
        this.batteryLevel = battery;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void drive(int distance) {
        super.drive(distance);
        // Decrease battery level by 1% for every 10 kilometers driven
        if (distance > 10000) { // Convert meters to kilometers
            batteryLevel -= (distance / 10000);
        }
    }

}
