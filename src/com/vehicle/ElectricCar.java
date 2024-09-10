package com.vehicle;

public class ElectricCar extends Car {
    private double batteryLevel; 

    public void setBatteryLevel(double battery) {
        this.batteryLevel = battery;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void drive(int distance) {
        super.drive(distance);
        
        if (distance > 10000) { 
            batteryLevel -= (distance / 10000);
        }
    }

}
