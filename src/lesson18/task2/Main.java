package lesson18.task2;

import lesson16.task4.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Hello");
        list.add(new Cat(3, "Black", 5));
        String text = list.get(0) + " World";
        System.out.println(text);
    }
}
