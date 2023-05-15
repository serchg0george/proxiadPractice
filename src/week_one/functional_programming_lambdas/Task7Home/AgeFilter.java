package week_one.functional_programming_lambdas.Task7Home;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AgeFilter {
    public static void main(String[] args) {
        List<String> nameByAge = Arrays.asList("Pesho 32", "Gosho 18", "Radka 29", "Maria 20", "Izdislav 16");

        Predicate<String> ageLessThen = s -> Integer.parseInt(s.split(" ")[1]) < 25;
        Consumer<String> printSortNames = s ->
                System.out.println(s.split(" ")[0]);
        nameByAge.stream()
                .filter(ageLessThen)
                .forEach(printSortNames);
    }
}
