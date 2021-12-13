package be.intecbrussel;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        iterateMethod();
    }

    private static void rangeMethod() {
        int sum = 0;
        for (int i = 0; i < 10; i++){
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        // Stream<T> | IntStream | LongStream | DoubleStream
        int streamSum = IntStream.range(0, 10)
                .filter(e -> e % 2 == 0)
                .sum();

        System.out.println(streamSum);
    }

    private static void generateMethod() {
        Stream.generate(() -> new Random().nextInt(50))
                .forEach(System.out::println);
    }

    private static void iterateMethod() {
        IntStream.iterate(1, i -> i * 2)
                .limit(20)
                .forEach(System.out::println);
    }
}
