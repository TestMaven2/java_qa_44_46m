package lesson15.task4;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {

        File file = new File("fileTest\\testFile.txt");
        boolean isFileExists = file.exists();
        System.out.println("Существует ли реальный файл? - " + isFileExists);

        file.createNewFile();
        isFileExists = file.exists();
        System.out.println("Существует ли реальный файл? - " + isFileExists);

        System.out.println("Размер файла - " + file.length());
        file.delete();
        isFileExists = file.exists();
        System.out.println("Существует ли реальный файл? - " + isFileExists);

        File file1 = new File("testDirectory");
        file1.mkdir();
        System.out.println("Является ли объект file1 файлом? - " + file1.isFile());
        System.out.println("Является ли объект file1 папкой? - " + file1.isDirectory());

        File file2 = new File("firstDir\\secondDir\\thirdDir\\fourthDir");
        // Метод может создавать только одну папку
        file2.mkdir();
        // Метод может создавать много папок
        file2.mkdirs();
        System.out.println(file2.exists());

        File[] files = file2.listFiles();
        for (File currentFile : files) {
            System.out.println(currentFile.getName() + " " + currentFile.isDirectory());
        }
    }
}
