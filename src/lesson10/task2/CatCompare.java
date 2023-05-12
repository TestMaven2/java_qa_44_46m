package lesson10.task2;

import java.util.Set;
import java.util.TreeSet;

public class CatCompare {

    public static void main(String[] args) {

        Set<Cat> cats = new TreeSet<>(new AllParametersComparator());

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

        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
