package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * <h1>CarRental</h1>
 * A class containing and running the methods of the program.
 */


public class CarRental {

    Scanner scan = new Scanner(System.in);

    ArrayList<AutomaticCar> loanedAutoCars = new ArrayList<>();
    ArrayList<ManualCar> loanedManuCars = new ArrayList<>();

    ArrayList<Customer> customers = new ArrayList<>();

    ArrayList<ManualCar> manualCars = new ArrayList<>();
    ArrayList<AutomaticCar> automaticCars = new ArrayList<>();

    public CarRental() {
        createAutomaticCar();
        createManualCar();

    }

    public void carRentalSign() {
        System.out.println("***********************************");
        System.out.println("*********** Welcome to ************");
        System.out.println("*********** Big Mike's ************");
        System.out.println("********* Cardealership! **********");
        System.out.println("***********************************\n");
    }


    public void showMainMenu() {

        int choice;
        do {
            System.out.println("Please make a selection with the buttons below:");
            System.out.println("1. Rent a car");
            System.out.println("2. Show Available Cars");
            System.out.println("3. Calculate prices");
            System.out.println("4. Help Menu");
            System.out.println("5. Return a Car");
            System.out.println("6. Exit Menu");
            System.out.println("Enter your choice here:");


            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    rentCar();
                    break;
                case 2:
                    availableCars();
                    break;
                case 3:
                    carPrices();
                    break;
                case 4:
                    helpMenu();
                    break;
                case 5:
                    returnCar();
                    break;

                case 6:

                    break;
                default:
                    System.out.println("Make one of the choices above using the numberpad:");
            }
        } while (choice != 6);




        //ADD TILL TRY CATCH


    }


    public void rentCar() {

        System.out.println("See Available Cars");
        System.out.println("1. Manual");
        System.out.println("2. Automatic");
        System.out.println("3. Return to Main Menu");


        boolean noStop = true;
        while(noStop){
        try{
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    manualCar();

                    break;
                case 2:
                    automaticCar();

                    break;
                case 3:

                    break;
                default:
                    System.out.println("Use the numberpad to make a choice above:");
        }
            noStop = false;
            }catch(Exception e) {
            System.out.println("Wrong input! use the correct numbers to contiunue:");
            scan.next();
        }


        /*
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                manualCar();
                break;
            case 2:
                automaticCar();
                break;
            case 3:

                break;
            default:
                System.out.println("Use the numberpad to make a choice above:");

                // ADD TILL TRY CATCH

         */


        }
    }



    private void automaticCar(){
        int i = 1;
        if(automaticCars.size() == 0){
            System.out.println("We apologize, but all Cars are allready rented");

        }else{
            System.out.println("Which Automatic car would you like to rent:");
            for(AutomaticCar car: automaticCars){
                System.out.println(i +". Car: " + car.getName()+
                        " Model: " + car.getModel()+
                        " Year: " + car.getYearModel()+
                        " Horse Power: " + car.getHorsePower()+
                        " Gear " + car.getAutomaticGears());
                i++;
            }

            int userChoice = scan.nextInt();
            System.out.println("Enter the name of the person renting the vehicle:");
            String name = scan.next();

            customers.add(new Customer(name));

            for(Customer customer1: customers){
                if(customer1.getName().equalsIgnoreCase(name)){
                    customer1.rentedAutoCar.add(automaticCars.get(userChoice-1));
                }
            }

            System.out.println("You have rented a: " + automaticCars.get(userChoice-1).getName() + " " + automaticCars.get(userChoice-1).getModel()+"\n");
            automaticCars.remove(automaticCars.get(userChoice-1));

            // ADD TILL TRY CATCH
        }

    }

    private void manualCar(){
        int i = 1;
        if(manualCars.size() == 0){
            System.out.println("We apologize, but all Cars are allready rented");

        }else{

            System.out.println("Which Manual car would you like to rent:");
            for(ManualCar car: manualCars){
                System.out.println(i + ". Car: " + car.getName()+
                        " Model: " + car.getModel()+
                        " Year: " + car.getYearModel()+
                        " Horse Power: " + car.getHorsePower()+
                        " Gear: " + car.getManualGears());
                i++;
            }
            int userChoice = scan.nextInt();
            System.out.println("Enter the name of the person renting the vehicle:");
            String name = scan.next();

            customers.add(new Customer(name));

            for(Customer customer1: customers){
                if(customer1.getName().equalsIgnoreCase(name)){
                    customer1.rentedManuCar.add(manualCars.get(userChoice-1));
                }
            }
            System.out.println("You have rented a: " + manualCars.get(userChoice-1).getName()+" "+ manualCars.get(userChoice-1).getModel()+"\n");
            manualCars.remove(manualCars.get(userChoice-1));

            // ADD TILL TRY CATCH
        }
    }

    public void availableCars(){
        System.out.println("*** Available Cars ***");
        System.out.println("Automatic Cars: \n");

        for(AutomaticCar car: automaticCars){
            System.out.println("Car: "+ car.getName()+
                    " Model: "+ car.getModel()+
                    " Year: "+ car.getYearModel()+
                    " Horse Power: "+ car.getHorsePower()+
                    " Gears: "+ car.getAutomaticGears());
        }

        System.out.println("\nManual Cars:\n");

        for(ManualCar car: manualCars){
            System.out.println("Car: "+ car.getName()+
                    " Model: "+ car.getModel()+
                    " Year: "+ car.getYearModel()+
                    " Horse Power: "+ car.getHorsePower()+
                    " Gears: "+ car.getManualGears());
        }
        System.out.println("");
    }


    public void carPrices(){

        double initialRentCost = 29.99;
        float costPerDay = 15f;
        int insurance = 60;

        System.out.println("*************************************************");
        System.out.println("Initial rentalcost: "+initialRentCost +" dollar");
        System.out.println("Cost per day: "+ costPerDay +" dollar");
        System.out.println("Insurance: "+ insurance +" dollar");
        System.out.println("************************************************\n");

        System.out.println("Enter the amount of days you plan to rent:");

        boolean noStop = true;
        while(noStop) {
            try{
                int days = scan.nextInt();

                double total = (costPerDay*days) + insurance;
                System.out.println("Total cost of your planned booking is: "+ total + " dollars"+ "\nInitial rentalcost: "+ initialRentCost +
                        "\nCost of days: "+ (costPerDay*days) + "\nCost of insurance: "+ insurance);
                System.out.println("\n1. Return to Main Menu");

                int input = scan.nextInt();
                while(input != 1){
                    input = scan.nextInt();
                }
                        noStop = false;
                }catch(Exception e) {
                System.out.println("Wrong input! Use the correct numbers to continue");
                scan.next();

            }
        }

        /*

        System.out.println("Enter the amount of days you plan to rent:");
        int days = scan.nextInt();

        double total = (costPerDay*days) + insurance;
        System.out.println("Total cost of your planned booking is: "+ total + " dollars"+ "\nInitial rentalcost: "+ initialRentCost +
                "\nCost of days: "+ (costPerDay*days) + "\nCost of insurance: "+ insurance);
        System.out.println("\n1. Return to Main Menu");
        int choice = scan.nextInt();

        boolean noStop = true;
        while(noStop){
            try{
                int input = scan.nextInt();
                while(input != 1){
                    input = scan.nextInt();
                }
                noStop = false;
            }catch(Exception e) {
                System.out.println("Wrong input! Use the correct numbers to continue");
                scan.next();
            }



        }

         */
    }


    public void helpMenu(){
        System.out.println("Big Mike's Cardealership Helpdesk\n");
        System.out.println("_________________________________________________________________________________________");
        System.out.println("Use the numbers on the numpad to make your desired choice in the menus.                 |");
        System.out.println("To calculate prices before renting choose option 3 in the main menu.                    |");
        System.out.println("Our open hours are 07.00 - 19.00 monday - sunday.                                       |");
        System.out.println("For more information see the entrance or our website www.Bigmikescardealership.notreal  |");
        System.out.println("                                                                                        |");
        System.out.println("Press 1 to return to Main Menu                                                          |");
        System.out.println("________________________________________________________________________________________|");

        boolean noStop = true;
        while(noStop){
            try{
                int input = scan.nextInt();
                while(input != 1){
                    System.out.println("Press 1 to return to Main Menu");
                    input = scan.nextInt();
                }

                noStop = false;
            }catch(Exception e){
                System.out.println("Wrong input! Use the correct numbers to continue");
                scan.next();

                // LOOP?
            }
        }
    }



    public void createAutomaticCar(){

        automaticCars.add(new AutomaticCar("Toyota", "Corolla", "Automatic", 2000, 350));
        automaticCars.add(new AutomaticCar("Audi", "TT", "Automatic", 2006, 650));
        automaticCars.add(new AutomaticCar("BMW", "Z3", "Automatic", 2009, 700));
        automaticCars.add(new AutomaticCar("WV", "Golf", "Automatic", 2012, 500));
        automaticCars.add(new AutomaticCar("Volvo", "V70", "Automatic", 2016, 550));
    }


    public void createManualCar(){
        manualCars.add(new ManualCar("Mazda", "178F", "Manual", 2002, 400));
        manualCars.add(new ManualCar("Audi", "R8", "Manual", 2019, 800));
        manualCars.add(new ManualCar("BMW", "Z4", "Manual", 2016, 700));
        manualCars.add(new ManualCar("Ferrari", "Spider", "Manual", 2017, 900));
        manualCars.add(new ManualCar("Volvo", "S60", "Manual", 2014, 450));
    }

    public void returnCar(){

        if(customers.size() == 0){
            System.out.println("No one have rented a car\n");

        }else{
            System.out.println("Name of the person returning the car:");
            String name = scan.next();

            for(Customer customer: customers){

                if(customer.getName().equalsIgnoreCase(name)){

                    if(customer.rentedAutoCar.size() != 0){

                        for(AutomaticCar automaticCar: customer.rentedAutoCar){
                            System.out.println("You have returned: "+ automaticCar.getName()+" "+ automaticCar.getModel());
                            automaticCars.add(automaticCar);
                        }
                        customer.rentedAutoCar.clear();
                    }
                    else if(customer.rentedManuCar.size() != 0){

                        for(ManualCar manualCar: customer.rentedManuCar){
                            System.out.println("You have returned: "+ manualCar.getName()+" "+manualCar.getModel());
                            manualCars.add(manualCar);
                        }
                        customer.rentedManuCar.clear();
                    }

                    System.out.println("Thanks for choosing Big Mike's "+ customer.getName()+"!\n");
                    customers.remove(customer);
                    break;
                }else{
                    System.out.println("No one named "+name+" has rented a car\n");
                }
            }
        }

    }

}
