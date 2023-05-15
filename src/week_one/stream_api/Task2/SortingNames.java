package week_one.stream_api.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortingNames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter names in format (Name1, Name2, Name3...): ");
        String inputNames = in.nextLine();
        List<String> names = Arrays.asList(inputNames.split(", "));
        System.out.println("Please enter letters in format (l, b, c...): ");
        String inputLetters = in.nextLine();
        List<String> letters = Arrays.asList(inputLetters.split(", "));

        names.stream()
                .map(String::toLowerCase)
                .filter(element -> letters.stream()
                        .map(String::toLowerCase)
                        .anyMatch(element::contains))
                .sorted()
//                .limit(1)
                .forEach(System.out::println);


    }
}
