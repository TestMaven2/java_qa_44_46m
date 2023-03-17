package lesson1;

public class Dog {

    private String breed;
    private int age;
    private String color;
    private String name;

    public Dog() {
        System.out.println("Вызван конструктор Dog");
    }

    public Dog(String name) {
        this.name = name;
        System.out.println("Вызван конструктор с параметром name");
    }

    public Dog(int age) {
        this.age = age;
        System.out.println("Вызван конструктор с параметром age");
    }

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
        System.out.println("Вызван конструктор с двумя параметрами");
    }

    public Dog(String breed, int age, String color, String name) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        // Если возраст меньше нуля,
        // то выбрасываем ошибку
        if (age < 0) {
            age = 0;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark() {
        int i = 7;
        String s = "Hello";
        System.out.println(name + " лает: Woof!");
    }

    void sleep() {

    }

    void walk() {

    }
}