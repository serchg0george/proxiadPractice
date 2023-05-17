package week_one.stream_api.Task5;

import java.util.*;
import java.util.stream.Collectors;

public class PopulationByDistrict {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city name and population in format 'city:population, city:population, city:population'");
        String input = scanner.nextLine();

        Map<String, List<Integer>> cityPopulationMap = Arrays.stream(input.split(", "))
                .map(pair -> pair.split(":"))
                .collect(Collectors.groupingBy(pair ->
                        pair[0], LinkedHashMap::new, Collectors.mapping(pair ->
                        Integer.parseInt(pair[1].replaceAll("\\D+", "")), Collectors.toList())));

        cityPopulationMap.entrySet().stream()
                .filter(entry -> entry.getValue().stream()
                        .anyMatch(population -> population > 10))
                .forEach(entry -> {
                    String city = entry.getKey();
                    List<Integer> populations = entry.getValue();

                    System.out.print(city + ": ");
                    populations.stream()
                            .sorted(Comparator.reverseOrder())
                            .forEach(population -> System.out.print(population + " "));
                    System.out.println();
                });

    }
}