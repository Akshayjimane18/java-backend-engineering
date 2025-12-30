package coreJava.in28Minutes.fileOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

    public static void main(String[] args) throws IOException {
        Path pathFileToWrite = Paths.get("./in28Minutes/file-write.txt");

        List<String> list = List.of("Apple", "Boy", "Cat", "Dog", "Elephant");

        try {
            Files.write(pathFileToWrite, list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}