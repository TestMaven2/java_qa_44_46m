package lesson13.task3;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {

        Predicate<String> predicate = x -> x.length() == 3;
    }
}
