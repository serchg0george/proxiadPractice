package week_one.stream_api.Task3;

import java.util.*;


public class TheSmallestEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        String input = in.nextLine();
        List<String> numbersStringParsed = Arrays.asList(input.split(", "));

        List<Double> numbersDouble = new ArrayList<>();

        numbersStringParsed.stream().forEach(x -> {
            numbersDouble.add(Double.parseDouble(x));
        });

        var smallestEven = numbersDouble.stream()
                .filter(x -> x % 2 == 0)
                .min(Double::compare)
                .get();

        System.out.println("Minimum value: " + smallestEven);
    }
}
