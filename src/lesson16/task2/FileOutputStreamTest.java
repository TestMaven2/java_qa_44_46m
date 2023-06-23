package lesson16.task2;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamTest {

    public static void main(String[] args) {

        File dir = new File("outputDir");
        dir.mkdir();
        File file = new File("outputDir\\output.txt");

        try (FileOutputStream out = new FileOutputStream(file, false)) {
            file.createNewFile();

//            out.write('X');
//            out.write("Hello");

            String info = "Apple, Banana, Peach";
            char[] chars = info.toCharArray();
            byte[] bytes = new byte[chars.length];

            for (int i = 0; i < chars.length; i++) {
                bytes[i] = (byte) chars[i];
            }

            out.write(bytes);
        } catch (Exception e) {
            System.out.println("Произошла ошибка");
        }
    }
}
