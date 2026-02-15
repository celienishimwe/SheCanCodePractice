package FullPractice;

import java.util.Scanner;

public class ServiceUsageTracker {

    static double totalUnits = 50;
    static double InitalUnits = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("-------------- Welcome to This System-------------");
            System.out.println("1. Consume Service Units");
            System.out.println("2. Check Remaining Units");
            System.out.println("3. View Usage Percentage");
            System.out.println("4. Reset Usage");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter units to consume: ");
                    double units = scanner.nextDouble();
                    consumeUnits(units);
                    break;

                case 2:
                    checkRemainingUnits();
                    break;

                case 3:
                    calculateUsagePercentage();
                    break;

                case 4:
                    resetUsage();
                    break;

                case 0:
                    System.out.println("---------Exiting--------");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }

    public static void consumeUnits(double units) {

        double remainingUnits = totalUnits - InitalUnits;

        if (units <= 0) {
            System.out.println("Error: You cannot consume negative or zero units.");
        }
        else if (units > remainingUnits) {
            System.out.println("Error: Not enough units available.");
        }
        else {
            InitalUnits = InitalUnits + units;
            double totalUnitsRemaining =totalUnits - InitalUnits;
            System.out.println("Success! " + units + " units consumed.");
            System.out.println("Remaining units: " + (totalUnitsRemaining ));
        }
    }

    public static void checkRemainingUnits() {
        double remainingUnits = totalUnits - InitalUnits;
        System.out.println("Remaining units: " + remainingUnits);
    }

    public static void calculateUsagePercentage() {

        if (totalUnits == 0) {
            System.out.println("Error: Cannot calculate percentage total units is zero.");
            return;
        }

        double percentage = (InitalUnits / totalUnits) * 100;
        System.out.println("Percentage:" + percentage);
    }

    public static void resetUsage() {
        InitalUnits = 0;
        System.out.println("initial value has been reset");
    }
}
