package lesson2;

public class Fish extends Animal {

    public boolean canFeedWithMilk;

    public Fish() {
        canFeedWithMilk = false;
    }

    @Override
    public void move() {
        System.out.println("Рыба плывёт в воде.");
    }
}
