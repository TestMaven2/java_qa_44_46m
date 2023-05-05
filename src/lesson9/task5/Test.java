package lesson9.task5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Pear");
        set.add("Peach");
        set.add("Fruit");
        set.add("Grape");
        set.add("Potato");
        set.add("Tomato");
        set.add("Corn");

        System.out.println(set);
    }
}
