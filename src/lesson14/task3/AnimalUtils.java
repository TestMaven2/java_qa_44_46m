package lesson14.task3;

import java.util.List;

public class AnimalUtils {

    public static void copy(List<? super LandAnimal> destination, List<? extends LandAnimal> source) {
        // ? super LandAnimal -> LandAnimal, Animal, Object
        // ? extends LandAnimal -> LandAnimal, Cow, Dog

        destination.addAll(source);
    }
}
