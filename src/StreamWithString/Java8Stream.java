package StreamWithString;

import java.util.Arrays;
import java.util.List;

public class Java8Stream {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
            list.stream().forEach(System.out::println);
            System.out.println("------------------");
            list.parallelStream().forEach(System.out::println);
            System.out.println("------------------");
            list.forEach(System.out::println);
        }
    }
