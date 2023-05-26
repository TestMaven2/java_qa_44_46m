package lesson12.task4;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatElements {
/*
* Первый элемент, встречающийся k раз в массиве
Дан массив из n целых чисел. Задача состоит в том, чтобы найти первый элемент, который встречается k раз. Если ни один элемент не встречается k раз, выведите -1. Распределение целочисленных элементов может быть в любом диапазоне.

Ввод : {1, 7, 4, 3, 4, 8, 7}, k = 2
Вывод : 7
Объяснение: И 7, и 4 встречаются 2 раза. Но 7 — это первое, которое встречается 2 раза.
* */

    public static void main(String[] args) {

        String[] words = {"Carrot", "Orange", "Peach", "Peach", "Banana", "Orange", "Peach", "Cherry", "Potato", "Mango", "Carrot", "Carrot"};

        System.out.println(getRepeatElement(words, 3));

    }

    public static String getRepeatElement(String[] words, int count) {

        Map<String, Integer> products = new LinkedHashMap<>();
        for (String product : words) {
            if (products.keySet().contains(product)) {
                Integer counter = products.get(product);
                products.put(product, ++counter);

            } else {
                products.put(product, 1);
            }
        }
        for (Map.Entry<String, Integer> pair : products.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (value == count) {
                return key;
            }
        }
        return null;
    }
}
