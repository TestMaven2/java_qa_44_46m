package lesson10.task2;

import java.util.Comparator;

public class CatComparatorByNameAndAge implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        // 1. Сравниваем имена котов.
        // 2. Если они не равны, то сортируем по имени.
        // 3. Если они равны, то сравниваем возрасты и сортируем по ним.

        String name1 = cat1.getName();
        String name2 = cat2.getName();

        if (!name1.equals(name2)) {
            return name1.compareTo(name2);
        }

        return cat2.getAge() - cat1.getAge();
    }
}
