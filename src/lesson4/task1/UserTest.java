package lesson4.task1;

public class UserTest {

    public static void main(String[] args) {


        User user1 = new User();
        User user2 = user1;

        System.out.println(user1.getName());
        System.out.println(user2.getName());

        user2.setName("Jack");

        System.out.println();
        System.out.println(user1.getName());
        System.out.println(user2.getName());

        DogTest dogTest = new DogTest();

        dogTest = new DogTest();
    }
}
