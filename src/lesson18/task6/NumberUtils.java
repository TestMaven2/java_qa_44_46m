package lesson18.task6;

import java.util.List;

public class NumberUtils {

    public void printIntegers(List<? extends Number> list) {
        for (Number current : list) {
            System.out.println(current.intValue());
        }
    }
}