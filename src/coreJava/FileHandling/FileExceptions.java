package coreJava.FileHandling;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileExceptions {
    public static void main(String[] args) throws Exception {
        String fileName = "Testing.csv";
//        Path path = Path.of(fileName);
//
//        List<String> list = Files.readAllLines(path);

        File file = new File(fileName);
        if(!file.exists()) {
            System.out.println("I can't run unless this file exist");
            return;
        }
        System.out.println("File exists, proceeding with operations...");
    }
}
