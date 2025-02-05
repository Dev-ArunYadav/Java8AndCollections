package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {

    public static void main(String[] args) {
        String[] arr1 = {"Arun", "Bob", "Chris"};
        List<String> list1 = Arrays.asList(arr1);

        List<String> list = Arrays.asList("Arun", "Boba", "Chris", "Bipin", "bob", "chris");

        System.out.println("Using Method Reference:");
        list.forEach(System.out::println);

        System.out.println("Using Lambda Expression:");
        list.forEach(s -> System.out.println(s));

        System.out.println("Using Stream:");
        list.stream().forEach(System.out::println);

    }
}