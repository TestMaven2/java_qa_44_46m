package lesson6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ListTest {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        integers.add(0, 3);
        integers.add(1, 5);
        integers.add(2, 7);
        integers.add(3, 15);

        System.out.println(integers);

        integers.add(1, 8);

        System.out.println(integers);

        integers.set(1, 9);

        System.out.println(integers);

        integers.add(4);

        System.out.println(integers);

        List<Integer> integers1 = new ArrayList<>();

        integers1.add(20);
        integers1.add(30);
        integers1.add(40);

        System.out.println(integers1);

        integers.addAll(2, integers1);

        System.out.println(integers);

        integers.remove(3);

        System.out.println(integers);

        integers.set(3, null);

        System.out.println(integers);

        List<String> words = new ArrayList<>();

        words.add("Hello");
        words.add("World!");
        words.add("I");
        words.add("Java!");
        words.add(3, "study");

        System.out.println(words);

        List<Object> objects = new ArrayList<>();
        objects.add("Hello!");
        objects.add(5);

        System.out.println(objects);

        words.remove(0);

        System.out.println("Удалили элемент по индексу.");
        System.out.println(words);

        words.remove("Java!");

        System.out.println("Удалили конкретный объект.");
        System.out.println(words);

        words.add("Java!");
        words.add(0, "Hello");

        System.out.println(words);

        List<String> otherWords = new ArrayList<>();

        otherWords.add("First");

        otherWords.addAll(words);

        System.out.println(otherWords);

        System.out.println(words.get(3));

        System.out.println(words.size());

        otherWords.clear();
        System.out.println(otherWords);
        otherWords.add("Hello");
        System.out.println(otherWords);

//        int index = words.indexOf("I");
//        System.out.println(index);
        words.add(words.indexOf("I") + 1, "like");

        System.out.println(words);

        System.out.println(words.isEmpty());
        otherWords.clear();
        System.out.println(otherWords.isEmpty());

        System.out.println(words.contains("study"));
        System.out.println(words.contains("learn"));

        for (int i = 0; i < words.size(); i += 2) {
            System.out.println(words.get(i));
        }

        for (String currentWord : words) {
            System.out.println(currentWord);
        }

        System.out.println();
        for (int i = 0; i < words.size(); i++) {
            // 1. Hello
            System.out.printf("%d. %s\n", i + 1, words.get(i));
        }
    }
}
