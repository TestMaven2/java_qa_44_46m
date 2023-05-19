package lesson11.task4;

public interface MyDeque {

    // Открытые методы (для пользователя)
    void addToHead(String element);

    void addToTail(String element);

    String removeHead();

    String removeTail();

    String peekHead();

    String peekTail();

    boolean isEmpty();

    String getByIndex(int index);

    boolean contains(String element);

    int size();

    // Закрытые методы (для внутренней логики)
//    void grow();
//
//    int calculateNewCapacity(int currentCapacity);
//
//    int calculateAdditionalCapacity(int currentCapacity);
}
