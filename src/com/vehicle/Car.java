package com.vehicle;

public class Car {
    private double speedKph; // Speed in kilometers per hour
    private float fuelLevel; // Fuel level as a percentage (0.0 to 100.0)
    private int distanceTraveled; // Distance traveled in meters

    public void setSpeed(double speed) {
        this.speedKph = speed;
    }

    public void setFuelLevel(float fuel) {
        this.fuelLevel = fuel;
    }

    public void drive(int distance) {
        this.distanceTraveled += distance;
    }

    public double getSpeedMph() {
        return speedKph / 1.60934; // Convert kilometers to miles
    }

    public int getDistanceKm() {
        return distanceTraveled / 1000; // Convert meters to kilometers
    }

    public int calculateRemainingFuel(double distance) {
        double fuelConsumed = (distance / 1000) * 0.5; // 0.5% fuel per km
        return (int) (fuelLevel - fuelConsumed);
    }
}
