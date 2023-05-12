package lesson8;

import java.util.Iterator;

public class MyLinkedList implements Iterable<String> {

    private int size = 0;
    private Node head;

    public void add(String value) {
        if (size == 0) {
            head = new Node(value, null);
        } else {
            Node newNode = new Node(value, head);
            head = newNode;
        }
        size++;
    }

    public MyIterator iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator {

        private int index;

        private Node current = head;


        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Object next() {
            String value = current.getValue();
            current = current.getNext();
            return value;
        }
    }

    private class Node {

        private String value;
        private Node next;

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}