package lesson10.task2;

import java.util.Objects;

public class Cat implements Comparable<Cat> {

    private String name;
    private int age;
    private double weight;

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Cat cat = (Cat) obj;

        // this - текущий кот, у которого мы вызвали метод equals
        // cat - тот кот, которого мы передали в метод для сравнения с текущим котом

        return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    @Override
    public String toString() {
        return String.format("Кот: имя - %s, возраст - %d, вес - %.2f.", name, age, weight);
    }

    @Override
    public int compareTo(Cat cat) {
        // this - текущий кот, у которого мы вызвали метод compareTo
        // cat - тот кот, которого мы передали в метод для сравнения с текущим котом
        return Double.compare(cat.weight, weight);
    }
}