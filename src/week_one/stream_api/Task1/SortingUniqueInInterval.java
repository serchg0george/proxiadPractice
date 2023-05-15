package week_one.stream_api.Task1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SortingUniqueInInterval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter numbers here: ");
        String input = in.nextLine();
        List<String> nums = Arrays.asList(input.split(", "));
        Predicate<String> numBetweenInterval = s ->
                Integer.parseInt(s.split(", ")[0]) > 10 && Integer.parseInt(s.split(", ")[0]) < 20;
        Consumer<String> printNum = s -> System.out.println(s);
        nums.stream()
                .filter(numBetweenInterval)
                .distinct()
                .limit(2)
                .forEach(printNum);
    }
}
