package lesson7.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

    public static void main(String[] args) {

        List<String> letters = new ArrayList<>();

        letters.add("V");
        letters.add("S");
        letters.add("L");
        letters.add("O");
        letters.add("Y");

        ListIterator<String> iterator = letters.listIterator();

//        while (iterator.hasNext()) {
//            String current = iterator.next();
//            System.out.print(current + " ");
//            if (current.equals("O")) {
//                break;
//            }
//        }
//        System.out.println();

        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}
