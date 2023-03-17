package lesson4.task5;

public class BookTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Author author = new Author("Герберт Шилдт");

        Book book1 = new Book("Java. Полное руководство", 1990);
        book1.setAuthor(author);
        Book book2 = (Book) book1.clone();

        System.out.println(book1.getName());
        System.out.println(book1.getAuthor().getName());
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor().getName());

        book2.setName("Алгоритмы.");
        book2.getAuthor().setName("Василий Григорьев");

        System.out.println();
        System.out.println(book1.getName());
        System.out.println(book1.getAuthor().getName());
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor().getName());
    }
}
