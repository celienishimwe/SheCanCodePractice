package FullPractice.Invetory;

public class Main {

    public static void main(String[] args) {

        Item Chair = new Item("Chair", 10, 50000);
        Item Television = new Item("Television", 10, 600000);

        System.out.println("Initial Inventory:");
        Chair.displayItem();
        Television.displayItem();

        System.out.println("--- Updating Chair Stock ---");
        Chair.addStock(5);
        Chair.displayItem();

        Chair.removeStock(20);
        Chair.displayItem();

        System.out.println("--- Updating Television Stock ---");

        // Bonus: Loop for bulk stock addition
        for (int i = 1; i <= 3; i++) {
            Television.addStock(10);
            System.out.println("group " + i + ":");
            Television.displayItem();
        }

        Television.removeStock(70);
        Television.displayItem();
    }
}
