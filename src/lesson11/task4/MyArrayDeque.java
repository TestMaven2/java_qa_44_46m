package lesson11.task4;

public class MyArrayDeque implements MyDeque {

    private String[] elements = new String[20];
    private int headIndex;
    private int tailIndex;
    private int size;

    public MyArrayDeque() { // select None
        headIndex = elements.length / 2;
        tailIndex = elements.length / 2;
    }

    @Override
    public void addToHead(String element) {
        if(!isEmpty()) {
            headIndex--;
        }
        elements[headIndex] = element;
        size++;
    }

    @Override
    public void addToTail(String element) {
        if(!isEmpty()) {
            tailIndex++;
        }
        elements[tailIndex] = element;
        size++;
    }

    @Override
    public String removeHead() {
        if(isEmpty()){
            throw new RuntimeException();
        }
        String result = elements[headIndex];
        elements[headIndex] = null;
        if(size > 1){
            headIndex++;
        }
        size--;
        return result;
    }

    @Override
    public String removeTail() {
        if(isEmpty()){
            throw new RuntimeException();
        }
        String result = elements[tailIndex];
        elements[tailIndex] = null;
        if (size > 1){
            tailIndex--;
        }
        size--;
        return result;
    }

    @Override
    public String peekHead() {
        return elements[headIndex];
    }

    @Override
    public String peekTail() {
        return elements[tailIndex];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String getByIndex(int index) {
        return null;
    }

    @Override
    public boolean contains(String element) {
        if (isEmpty()) {
            return false;
        }
        for (int i = headIndex; i <= tailIndex; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    private void grow() {

    }

    private int calculateNewCapacity(int currentCapacity) {
        return 0;
    }

    private int calculateAdditionalCapacity(int currentCapacity) {
        return 0;
    }

    public MyArrayDeque(int size) {
        this.size = size;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        //hw: Hello World I study Java -> [Hello, World, I, study, Java]
        if(isEmpty()){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = headIndex; i <= tailIndex; i++){
            builder.append(elements[i]).append(", ");
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}