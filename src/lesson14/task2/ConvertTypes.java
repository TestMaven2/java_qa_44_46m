package lesson14.task2;

import java.util.function.Function;

public class ConvertTypes {

    public static void main(String[] args) {

        Dog dog = new Dog(3, "Black", 9.48);
        System.out.println(dog);

        // Функция, конвертирующая объект собаки в объект кота
        Function<Dog, Cat> converter = x -> new Cat(x.getAge(), x.getColor(), x.getWeight() / 2);

        Cat cat = converter.apply(dog);
        System.out.println(cat);
    }
}
