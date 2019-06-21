package tutorial.exceptions.handlingExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App2 {

    public static void main(String[] args) {

        File file = new File("test.txt");

        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("File is found");

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found: " + file.toString());
        }
    }
}
