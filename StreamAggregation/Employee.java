package FullPractice.StreamAggregation;

public class Employee {
    String name;
    int amount;
    String region;

    public Employee(String name,int amount, String region){
        this.name = name;
        this.amount = amount;
        this.region = region;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", region='" + region + '\'' +
                '}';
    }
}
