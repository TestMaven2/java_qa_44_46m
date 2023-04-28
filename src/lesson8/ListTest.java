package lesson8;

public class ListTest {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        // Здесь будем вызывать методы нашего листа

        list.add("Hello");
        list.add("World");
        list.add("Java");

        // Блок тестирования
        System.out.println("Вывод в консоль с помощью toString");
        System.out.println(list);
        System.out.println();

        System.out.println("Вывод в консоль с помощью for-each");
        for (String value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Вывод в консоль с помощью итератора");
        MyLinkedList.MyIterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
