package be.intecbrussel;

import java.util.Locale;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
//        withoutStreams();
        withStreams();
    }

    private static void withoutStreams() {
        String[] words = {"This", "day", "is", "a", "good", "day"};

        String[] wordsEqualOrLongerThanThreeLetter = new String[5];
        int index = 0;
        for (String word : words) {
            if (word.length() >= 3) {
                wordsEqualOrLongerThanThreeLetter[index] = word;
                index++;
            }
        }

        for (String word : wordsEqualOrLongerThanThreeLetter) {
            if (word != null) {
                System.out.println(word);
            }
        }
    }

    private static void withStreams() {
        String[] words = {"This", "day", "is", "a", "good", "day"};

        String[] wordsEqualOrLongerThanThreeLetter = Stream.of(words)
                .filter(word -> word.length() >= 3 && word.startsWith("i"))
                .toArray(String[]::new);

        Stream.of(wordsEqualOrLongerThanThreeLetter)
                .filter(word -> checkCondition(word))
                .forEach(System.out::println);
    }

    private static boolean checkCondition(String word) {
        if (word.length() >= 3) {
            if (word.startsWith("i")) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }


}
