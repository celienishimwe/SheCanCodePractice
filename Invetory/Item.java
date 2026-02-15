package FullPractice.Invetory;

public class Item {
        public String name;
        public int quantity;
        public double price;

        public Item(String name, int quantity, double price) {
            this.name = name;
            if (quantity >= 0) {
                this.quantity = quantity;
            } else {
                this.quantity = 0;
            }
            if (price >= 0) {
                this.price = price;
            } else {
                this.price = 0;
            }
        }
        public void addStock(int amount) {
            if (amount > 0) {
                quantity = quantity + amount;
                System.out.println("Added " + amount);
            } else {
                System.out.println("Invalid amount");
            }
        }
        public void removeStock(int amount) {
            if (amount <= 0) {
                System.out.println("Invalid amount");
            }
            else if (amount > quantity) {
                System.out.println("Not enough stock");
                quantity = 0;
            }
            else {
                quantity = quantity - amount;
                System.out.println("Removed " + amount);
            }
        }

        public double getValue() {
            return quantity * price;
        }

        public void displayItem() {
            System.out.println("Item: " + name +
                    ", Quantity: " + quantity +
                    ", Price: Rwf" + price +
                    ", Value: Rwf" + getValue());
        }
}
