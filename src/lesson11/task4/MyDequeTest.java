package lesson11.task4;

public class MyDequeTest {

    public static void main(String[] args) {

        MyArrayDeque deque = new MyArrayDeque();

        System.out.println(deque);
        deque.addToHead("Apple");
        deque.addToHead("Banana");
        deque.addToHead("Cherry");

        deque.addToTail("Potato");
        deque.addToTail("Carrot");
        deque.addToTail("Tomato");
        System.out.println(deque);

        System.out.println(deque.size());

        System.out.println(deque.peekHead());

        System.out.println(deque.peekTail());

        System.out.println(deque);

        System.out.println(deque.size());

        System.out.println(deque.removeHead());

        System.out.println(deque.removeTail());

        System.out.println(deque);

        System.out.println(deque.size());

        System.out.println(deque.contains("Orange"));
        System.out.println(deque.contains("Potato"));
    }
}
