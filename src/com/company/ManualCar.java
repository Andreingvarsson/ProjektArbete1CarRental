package com.company;

/**
 * <h1>ManualCar</h1>
 *  ManualCar is a class that extends the superclass Car, and also adds its own function to create a car, specifically a manual geared car.
 */

public class ManualCar extends Car {

    private String manualGears;



    public ManualCar(String name, String model, String manualGears, int yearModel, int horsePower) {
        super(name, model, yearModel, horsePower);

        this.manualGears = manualGears;
    }
    /**
     * method that return the geartype.
     * @return Returns the type of gear - manualGears.
     */

    public String getManualGears(){
        return manualGears;
    }
}
