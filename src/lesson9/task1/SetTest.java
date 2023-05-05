package lesson9.task1;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        SortedSet<String> set = new TreeSet<>();

        set.add("D");
        set.add("A");
        set.add("C");
        set.add("B");
        set.add("C");

        System.out.println(set);

        System.out.println(set.contains("B"));
        System.out.println(set.contains("E"));

        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        boolean removeResult = set.remove("B");
        boolean removeResult1 = set.remove("S");

        System.out.println(removeResult);
        System.out.println(removeResult1);
        System.out.println(set);


    }
}
