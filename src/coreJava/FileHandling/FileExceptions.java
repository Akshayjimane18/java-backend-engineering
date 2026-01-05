package coreJava.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileExceptions {
    public static void main(String[] args) throws Exception {
        String fileName = "Testing.csv";

        testFile2(fileName);
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("I can't run unless this file exist");
            return;
        }
        System.out.println("File exists, proceeding with operations...");
    }

    private static void testFile(String fileName) {
        Path path = Path.of(fileName);
        FileReader fr = null;
        try {
            //List<String> list = Files.readAllLines(path);
            fr = new FileReader(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Finally block executed");
        }
        System.out.println("End of testFile method");
    }

    /* This is try with resources. It automatically closes the resource because of
     * AutoCloseable interface
     * And this has been introduced in Java 17
     */
    private static void testFile2(String fileName) {
        try (FileReader fr = new FileReader(fileName)) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End of testFile method");
    }

}
