package lesson9.task3;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSetTest {

    public static void main(String[] args) {

        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();

        set.add("Apple");
        set.add("Lemon");
        set.add("Orange");
        set.add("Banana");
        set.add("Apple");
    }
}
