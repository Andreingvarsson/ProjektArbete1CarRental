package com.company;

/**
 * <h1>AutomaticCar</h1>
 * AutomaticCar is a class that extends the superclass car, and also adds its own function to create a car, specifically a automatic geared car.
 */

public class AutomaticCar extends Car {

    private String automaticGears;

    public AutomaticCar(String name, String model, String automaticGears, int yearModel, int horsePower) {
        super(name, model, yearModel, horsePower);

        this.automaticGears = automaticGears;
    }

    /**
     * method that return the geartype.
     * @return Returns the type of gear - automaticGears.
     */

    public String getAutomaticGears(){
        return automaticGears;
    }
}
