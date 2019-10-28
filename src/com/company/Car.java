package com.company;


/**
 * <h1>Car</h1>
 * Car is a abstract class creating the general functions of a car.
 * The name, the model, the yearmodel and the cars horsepower.
 */

public abstract class Car {

    private String name;
    private String model;
    private int yearModel;
    private int horsePower;

    public Car(String name, String model, int yearModel, int horsePower){

        this.name = name;
        this.model = model;
        this.yearModel = yearModel;
        this.horsePower = horsePower;

    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYearModel() {
        return yearModel;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
