package coreJava.in28Minutes.fileOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirectorScanRunner {

    public static void main(String[] args) throws IOException {
        try {
            Path currentDir = Paths.get(".//in28Minutes");
            //Files.list(currentDir).forEach(System.out::println);

            Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");

            Files.walk(currentDir, 2).filter(predicate).forEach(System.out::println);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
