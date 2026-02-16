package FullPractice.Generics;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicate <String> removeDuplicate = new RemoveDuplicate<>();

        removeDuplicate.NoDuplicate("Celie");
        removeDuplicate.NoDuplicate("Celise");
        removeDuplicate.NoDuplicate("Isimbi");
        removeDuplicate.NoDuplicate("Celie");
    }
}
