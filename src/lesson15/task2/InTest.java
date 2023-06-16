package lesson15.task2;

import java.io.*;

public class InTest {

    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("fileTest\\test.txt");
        Reader reader = new InputStreamReader(in);

        int data = reader.read();

        while (data != -1) {
            System.out.print((char) data);
            data = reader.read();
        }
    }
}
