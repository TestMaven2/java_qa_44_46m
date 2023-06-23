package lesson16.task2;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamTest {

    public static void main(String[] args) {

        File dir = new File("testDir");
        dir.mkdir();
        File file = new File("testDir\\inputTest.txt");

        try {
            file.createNewFile();
            FileInputStream in = new FileInputStream(file);
            System.out.println("Available: " + in.available());

            in.skip(13);

            System.out.println("Available: " + in.available());

            int read = in.read();
            System.out.println("Считанная информация: " + (char) read);

            while (read != -1) {
                System.out.print((char) read);
                read = in.read();
            }

            in.close();
        } catch (Exception e) {
            System.out.println("Произошла ошибка");
        }
    }
}
