package lesson10.task2;

import java.util.Comparator;

public class CatComparatorByName implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getName().compareTo(cat2.getName());
    }
}