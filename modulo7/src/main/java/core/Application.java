package core;

import core.car.Car;

public class Application {

    public static void main(String[] args) {

        // Creates a White Jeep SUV
        Car car = new Car("SUV", "Jeep", "White");

        // Tries to drive the car
        car.drive();

        /*
        To drive the car you need to turn the key
        If the car's engine is off, turning the key will turn it on
        If the car's engine is on, turning the key will turn it off
         */
        car.turnEngineKey();

        car.drive();
    }

}
