package com.company;

import java.util.ArrayList;

/**
 * Class Customer, creates a costumer that rents a car.
 */

public class Customer {

    private String name;
    ArrayList<AutomaticCar> rentedAutoCar = new ArrayList<>();
    ArrayList<ManualCar> rentedManuCar = new ArrayList<>();

    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    /*

    public void printCarArray(){
        for(ManualCar manualCar: rentedManuCar){
            System.out.println(manualCar.getName()+manualCar.getManualGears());
        }
    }

    public ArrayList<AutomaticCar> getAutoArray(){
        return rentedAutoCar;
    }

    public ArrayList<ManualCar> getManuArray(){
        return rentedManuCar;
    }

     */

}
