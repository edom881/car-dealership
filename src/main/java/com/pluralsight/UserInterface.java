package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner scanner = new Scanner(System.in);

    public void display() {

        init();

        boolean running = true;

        while (running) {

            System.out.println("\n--- Car Dealership Menu ---");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Find vehicles by price");
            System.out.println("3 - Find vehicles by make/model");
            System.out.println("99 - Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    processAllVehiclesRequest();
                    break;

                case 2:
                    processGetByPriceRequest();
                    break;

                case 3:
                    processGetByMakeModelRequest();
                    break;

                case 99:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void processGetByPriceRequest() {

        System.out.print("Enter minimum price: ");
        double min = scanner.nextDouble();

        System.out.print("Enter maximum price: ");
        double max = scanner.nextDouble();
        scanner.nextLine();

        displayVehicles(dealership.getVehiclesByPrice(min, max));
    }


    private void init() {

        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();
    }

    private void processAllVehiclesRequest() {

        displayVehicles(dealership.getAllVehicles());
    }

    private void displayVehicles(java.util.ArrayList<Vehicle> vehicles) {

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
    private void processGetByMakeModelRequest() {

        System.out.print("Enter make: ");
        String make = scanner.nextLine();

        System.out.print("Enter model: ");
        String model = scanner.nextLine();

        displayVehicles(dealership.getVehiclesByMakeModel(make, model));
    }
}