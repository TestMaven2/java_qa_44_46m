package lesson12.task1;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Banana", 78);
        map.put("Orange", 56);
        map.put("Potato", 45);
        map.put("Strawberry", 99);
        map.put("Mango", 150);
        map.put("Carrot", 34);
        map.put("Apple", 40);
        map.put("Orange", 62);

        System.out.println("Цена манго: " + map.get("Mango"));
        System.out.println("Цена апельсина: " + map.get("Orange"));
        System.out.println(map.get("Pear"));

        Set<String> set = new HashSet<>();
        Iterator<String> setIterator = set.iterator();

        for (String value : set) {

        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.printf("Продукт - %s, цена - %d\n", key, value);
        }

        System.out.println("Обработка map при помощи итератора:");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();

            if ("Apple".equals(key) || value > 90) {
                iterator.remove();
            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.printf("Продукт - %s, цена - %d\n", key, value);
        }

        System.out.println("Все товары в магазине:");

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("Все цены магазина:");

        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }
}
