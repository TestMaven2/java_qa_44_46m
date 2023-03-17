package lesson1;

import lesson1.test.House;

public class Main {

    public static void main(String[] args) {

        House house = new House();

        int i = 7;
        Dog dog;
        System.out.println();
        System.out.println("До создания объекта");
        dog = new Dog();
        System.out.println("После создания объекта");

        Dog dog1 = new Dog();

        Dog dog2 = new Dog("Барбос");

        Dog sharik = new Dog("Шарик");

        Dog dog3 = new Dog(3);

        Dog dog4 = new Dog(7, "Чёрный");

//        System.out.println(dog2.name);
//        System.out.println(dog4.age);
//
//        System.out.println(sharik.name);

        sharik.bark();
        dog2.bark();
        dog.bark();

        System.out.println(sharik.getName());
        System.out.println(dog2.getName());

        sharik.setAge(-7);
        System.out.println(sharik.getAge());

        sharik.bark();

        Dog dog5 = new Dog("Овчарка", 3, "Чёрный", "Граф");
        System.out.println(dog5.getName());

        System.out.println(dog5.getName());
        System.out.println(dog5.getAge());

        System.out.println(dog5.getName() + " " + dog5.getAge());
        System.out.println(dog5.getAge() + dog5.getAge());

        System.out.println("Имя: " + dog5.getName() + " Возраст: " + dog5.getAge() + " Цвет: " + dog5.getColor() + " Порода: " + dog5.getBreed());
    }

    // ""   - пустая строка
    // null - вообще отсутствие какого-либо значения
    // 0 - ноль
}
