package lesson2;

public abstract class Mammal extends Animal {

    public boolean canFeedWithMilk;

    public Mammal() {
        canFeedWithMilk = true;
        System.out.println("Вызван конструктор Mammal");
    }

    public abstract void voice();
}
