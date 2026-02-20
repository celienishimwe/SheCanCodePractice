package FullPractice.StreamAggregation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClassEmployee {
    public static void main(String[] args) {
        List<Employee> employee = List.of(new Employee("celie",500,"Kigali"),
                new Employee("Cyiza",6000,"Kigali"),new Employee("Cynthia",7000,"Ruhango"), new Employee("Isimbi",900,"Muhanga"));

        Employee HighestSalary = employee.stream().reduce((a,b) -> a.amount > b.amount ? a : b).get();

        System.out.println("the person has high value is:" + HighestSalary.name + " " + "with amount :" + HighestSalary.amount );

        Map<String,List<Employee>> groupRegion = employee.stream().collect(Collectors.groupingBy(a -> a.region));

        for(Map.Entry<String,List<Employee>> entry : groupRegion.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
