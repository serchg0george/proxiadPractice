package week_one.stream_api.Task8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbersInRange {

    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        findPrimeNumbers(start,end);

    }

    public static void findPrimeNumbers(int start, int end) {
        List<Integer> primeNumbers = IntStream.rangeClosed(start, end)
                .filter(PrimeNumbersInRange::isPrime)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Prime numbers in range: ");
        primeNumbers.forEach(number -> System.out.println(number + " "));
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
