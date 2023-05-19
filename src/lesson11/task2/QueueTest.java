package lesson11.task2;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityBlockingQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Queue: " + queue);

        Integer element = queue.peek();
        System.out.println("Peek: " + element);
        System.out.println("Queue: " + queue);

        element = queue.poll();
        System.out.println("Poll: " + element);
        System.out.println("Queue: " + queue);

        System.out.println("Size: " + queue.size());
    }
}
