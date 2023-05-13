package week_one.functional_programming_lambdas.Task5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class PricesWithVatUnaryOperator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        List<String> inputArray = Arrays.asList(input.split(", "));

        UnaryOperator<Double> addVat = d -> d + (d * (20d / 100d));

        for (String string : inputArray) {
            System.out.println(addVat.apply(Double.valueOf(string)));
        }
    }
}
