package week_one.stream_api.Task6;

import java.util.*;
import java.util.stream.Collectors;

public class PrintingThreeMostUsedWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter text here: ");
        String input = in.nextLine();

        Map<String, Integer> wordCountMap = Arrays.stream(input.split(" "))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toMap(
                        String::toLowerCase,
                        word -> 1,
                        Integer::sum
                ));

        List<Map.Entry<String, Integer>> sortedWords = wordCountMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Most used words: ");
        for (Map.Entry<String, Integer> entry:
             sortedWords) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
