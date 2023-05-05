package lesson9.task6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayToSet {

    public static void main(String[] args) {

        Integer[] array = {5, 8, 7, 9, 2, 1};

        Set<Integer> integerSet1 = new HashSet<>();

        for (Integer integer : array) {
            integerSet1.add(integer);
        }

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Set 1: " + integerSet1);

        Set<Integer> integerSet2 = new HashSet<>(Arrays.asList(array));
        System.out.println("Set 2: " + integerSet2);

        Set<Integer> integerSet3 = new HashSet<>();
        Collections.addAll(integerSet3, array);
        System.out.println("Set 3: " + integerSet3);

        Set<Integer> integerSet4 = Arrays.stream(array).collect(Collectors.toSet());
        System.out.println("Set 4: " + integerSet4);

        Set<Integer> integerSet5 = new HashSet<>(Set.of(array));
        System.out.println("Set 5: " + integerSet5);
    }
}
