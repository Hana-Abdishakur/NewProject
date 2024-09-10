package com.vehicle.test;

import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setSpeed(80.0); // Set speed to 100 Kph
        myCar.setFuelLevel(80.0f); // Set fuel level to 80%

        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.setSpeed(140.0); // Set speed to 120 Kph
        myElectricCar.setFuelLevel(60.0f); // Set fuel level to 60%
        myElectricCar.setBatteryLevel(85.0); // Set battery level to 85%

        int distance = 20000; // Drive 20 kilometers

        myCar.drive(distance);
        myElectricCar.drive(distance);

        System.out.println("My Car:");
        System.out.println("Speed (mph): " + myCar.getSpeedMph());
        System.out.println("Distance (km): " + myCar.getDistanceKm());
        System.out.println("Remaining Fuel (%): " + myCar.calculateRemainingFuel(distance));

        System.out.println("\nMy Electric Car:");
        System.out.println("Speed (mph): " + myElectricCar.getSpeedMph());
        System.out.println("Distance (km): " + myElectricCar.getDistanceKm());
        System.out.println("Remaining Fuel (%): " + myElectricCar.calculateRemainingFuel(distance));
        System.out.println("Remaining Battery (%): " + myElectricCar.getBatteryLevel());
    }
}
