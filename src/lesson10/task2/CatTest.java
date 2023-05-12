package lesson10.task2;

import lesson9.task2.Student;

import java.util.*;

public class CatTest {

    public static void main(String[] args) {

//        Cat cat1 = new Cat("Барсик", 1, 3.12);
//        Cat cat2 = new Cat("Барсик", 1, 3.12);

        Cat cat1 = new Cat(1, 3.12);
        Cat cat2 = new Cat(1, 3.12);

        boolean result = cat1.equals(cat2);
        System.out.println("Результат: " + result);

        System.out.println();

        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Барсик", 1, 3.65));
        cats.add(new Cat("Мурзик", 7, 4.18));
        cats.add(new Cat("Рыжик", 2, 2.98));
        cats.add(new Cat("Рыжик", 5, 2.23));
        cats.add(new Cat("Рыжик", 1, 4.56));
        cats.add(new Cat("Рыжик", 4, 3.92));
        cats.add(new Cat("Рыжик", 4, 4.27));
        cats.add(new Cat("Рыжик", 4, 2.65));
        cats.add(new Cat("Рыжик", 4, 3.52));
        cats.add(new Cat("Пират", 9, 3.27));

        Collections.sort(cats, new AllParametersComparator());

        for (Cat cat : cats) {
            System.out.println(cat);
        }

        Set<Cat> cats1 = new TreeSet<>(new AllParametersComparator());

        cats1.add(new Cat("Барсик", 1, 3.65));
        cats1.add(new Cat("Мурзик", 7, 4.18));
        cats1.add(new Cat("Рыжик", 2, 2.98));
        cats1.add(new Cat("Рыжик", 5, 2.23));
        cats1.add(new Cat("Рыжик", 1, 4.56));
        cats1.add(new Cat("Рыжик", 4, 3.92));
        cats1.add(new Cat("Рыжик", 4, 4.27));
        cats1.add(new Cat("Рыжик", 4, 2.65));
        cats1.add(new Cat("Рыжик", 4, 3.52));
        cats1.add(new Cat("Пират", 9, 3.27));

        System.out.println();
        System.out.println("Вывод TreeSet");

        for (Cat cat : cats1) {
            System.out.println(cat);
        }
    }
}
