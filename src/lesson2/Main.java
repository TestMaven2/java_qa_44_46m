package lesson2;

public class Main {

    public static void main(String[] args) {

//        Animal animal = new Animal();
//        animal.printInfo();

        Fish fish = new Fish();
        fish.printInfo();

        Cat cat = new Cat();
        cat.printInfo();

//        Mammal mammal = new Mammal();
//        mammal.printInfo();

        System.out.println(cat.getName());

        cat.move();

        System.out.println("Создаём собаку");
        Dog dog = new Dog();

        System.out.println(dog.canEat);
        System.out.println(dog.canFeedWithMilk);

        SomeFish someFish = new SomeFish();
        System.out.println(someFish.canFeedWithMilk);
        System.out.println(someFish.canEat);

        Fish fish1 = new Fish();
        System.out.println(fish1.canFeedWithMilk);
        System.out.println(fish1.canEat);

        Animal.getInfo();

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");

        System.out.println(cat1.name);
        System.out.println(cat2.name);
        System.out.println("Меняем имя первому коту");
        cat1.name = "Рыжик";
        System.out.println(cat1.name);
        System.out.println(cat2.name);
        System.out.println("Количество лап");
        System.out.println(cat1.pawsCount);
        System.out.println(cat2.pawsCount);
        System.out.println("Меняем количество лап первому коту");
        Cat.pawsCount = 5;
        System.out.println(cat1.pawsCount);
        System.out.println(Cat.pawsCount);

        Cat cat3 = new Cat();

        Mammal mammal = new Cat();
        Mammal mammal1 = new Dog();

        mammal.voice();
        mammal1.voice();

        System.out.println("Тестируем перегруженные методы");
        cat3.voice();
        cat3.voice("Барсик", true);
        cat3.voice("Барсик", false);
        cat3.voice(5);
    }
}
