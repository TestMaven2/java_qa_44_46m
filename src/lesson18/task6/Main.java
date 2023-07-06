package lesson18.task6;

import lesson16.task4.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 45.6   12.4   87.1 -> 45   12   87

        List<Long> list1 = new ArrayList<>();
        list1.add(45L);
        list1.add(78945L);
        list1.add(100L);

        List<Double> list2 = new ArrayList<>();
        list2.add(45.12);
        list2.add(123.876);
        list2.add(998.999);

        NumberUtils utils = new NumberUtils();
        utils.printIntegers(list1);
        System.out.println();
        utils.printIntegers(list2);

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1, "Black", 3));
//        utils.printIntegers(cats);
    }
}
