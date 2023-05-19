package lesson11.task1;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

//        System.out.println(stack.peek());

        stack.push("Hello");
        stack.push("World");
        stack.push("I");
        stack.push("study");
        stack.push("Java");

        System.out.println(stack);

        String element = stack.pop();

        System.out.println(element);

        System.out.println(stack);

        element = stack.peek();

        System.out.println("Peek:");
        System.out.println(element);
        System.out.println(stack);

        System.out.println("Empty: " + stack.empty());

        System.out.println("Get: " + stack.get(1));
        System.out.println(stack);

        System.out.println("Search: " + stack.search("Java"));
        System.out.println("Search: " + stack.search("study"));
        System.out.println("Search: " + stack.search("I"));
        System.out.println("Search: " + stack.search("World"));

        System.out.println("Get: " + stack.get(3));
    }
}
