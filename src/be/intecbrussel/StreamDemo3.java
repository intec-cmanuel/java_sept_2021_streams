package be.intecbrussel;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        // Consumerende eindbewerking
        IntStream.range(0,10)
                .forEach(e -> System.out.println("Number: " + e));

        // Reducerende eindbewerking
        int a = IntStream.range(0,10)
                .sum();

        int product = IntStream.range(1,10)
                .reduce(1, (acc, e) -> acc * e);
        System.out.println("product: " + product);

        String newWord = Stream.of("this", "day", "potato")
                .reduce("My sentence is: ", (acc, e) -> acc.concat(e).concat(" "));
        System.out.println(newWord);

        // Collecterende eindbewerking
        int[] arr = IntStream.range(0,10)
                .toArray();
    }
}
