package week_one.functional_programming_lambdas.Task3;

import java.util.Random;
import java.util.function.Supplier;

public class Dice {

    public static void main(String[] args) {
        Supplier<Integer> roll = () -> (new Random().nextInt(6)) + 1;

        System.out.println(roll.get() + " / " + roll.get());
    }

}
