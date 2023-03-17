package lesson2;

public class Cat extends Mammal {

    public String name;
    public static int pawsCount = 4;

    public Cat() {
        System.out.println("Вызван конструктор кот");
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Кошка бежит по земле.");
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }

    public void voice(String name, boolean isMeow) {
        if (isMeow) {
            System.out.println(name + " мяукает");
        } else {
            System.out.println(name + " мурлычет");
        }
    }

    public void voice(int i) {
        System.out.println("Кот мяукнул " + i + " раз");
    }
}
