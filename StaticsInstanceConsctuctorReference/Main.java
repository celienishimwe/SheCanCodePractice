package FullPractice.StaticsInstanceConsctuctorReference;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arr1 = List.of("nishimwe","Celie");

        arr1.stream().map(StringUtils::reverseString).forEach(System.out::println);
    }
}
