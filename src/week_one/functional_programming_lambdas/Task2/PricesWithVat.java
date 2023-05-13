package week_one.functional_programming_lambdas.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class PricesWithVat {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        List<String> inputArray = Arrays.asList(input.split(", "));

        Function<Double, Double> addVat = d -> d + (d * (20d / 100d));

        // UnaryOperator<Double> addVat = d -> d + (d*(20d/100d)); TASK 5

        for (String string : inputArray) {
            System.out.println(addVat.apply(Double.valueOf(string)));
        }
    }

}
