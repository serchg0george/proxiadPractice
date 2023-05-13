package week_one.functional_programming_lambdas.Task4;


import java.util.Scanner;
import java.util.function.Predicate;

public class CountOfWordsWithCapitalLetter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] inputArray = input.split(" ");

        Predicate<String> upperCaseChecker = s -> Character.isUpperCase(s.charAt(0));

        for (String string : inputArray) {
            if (upperCaseChecker.test(string))
                System.out.println(string);
        }
    }

}
