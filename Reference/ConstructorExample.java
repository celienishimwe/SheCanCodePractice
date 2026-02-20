package FullPractice.Reference;

import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    Person(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob");
        List<Person> people = names.stream()
                .map(Person::new).collect(Collectors.toList());

        System.out.println("the list we have is:" + people);
    }
}
