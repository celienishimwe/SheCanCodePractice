package FullPractice.StaticsInstanceConsctuctorReference;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("celie", "nishimwe", "cyiza");
        List<String> arr1 = List.of("nishimwe", "Celie");

        System.out.println("Printing names directly from the list:");
        names.forEach(name -> System.out.println(name));


        List<Person> people = names.stream()
                .map(Person::new)
                .collect(Collectors.toList());

        people.forEach(Person::sayHello);
        
        arr1.stream()
                .map(StringUtils::reverseString)
                .forEach(System.out::println);
    }
}
