package com.company;

import static org.junit.Assert.*;

public class CarRentalTest {

    @org.junit.Test
    public void createAutomaticCar() {

        CarRental carRental = new CarRental();

        assertTrue(carRental.automaticCars.size() == 5);
    }

    @org.junit.Test
    public void createManualCar() {

        CarRental carRental = new CarRental();

        assertFalse(carRental.manualCars.size() != 5);

    }
}