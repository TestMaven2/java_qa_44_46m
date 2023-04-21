package lesson7.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorTest {

    public static void main(String[] args) {

        List<String> letters = new ArrayList<>();

        letters.add("J");
        letters.add("R");
        letters.add("K");
        letters.add("F");
        letters.add("E");
        letters.add("W");
        letters.add("A");
        letters.add("W");

        Spliterator<String> spliterator = letters.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();

        spliterator1.forEachRemaining(x -> System.out.println("Second spliterator " + x));
        spliterator.forEachRemaining(x -> System.out.println("First spliterator " + x));

    }
}
