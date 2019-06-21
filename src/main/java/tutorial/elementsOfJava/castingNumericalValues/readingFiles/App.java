package tutorial.elementsOfJava.castingNumericalValues.readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\Users\\Laptop\\IdeaProjects\\kurs\\src\\main\\java\\tutorial\\other\\readingFiles\\textfile.txt";

        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);

        // wyczytujemy int z pliku tekstowego poprzez 'nextInt()':
        int value = in.nextInt();
        System.out.println("Otrzymana wartość: " + value);

        in.nextLine();

        // odczytujemy całązawartość pliku tekstowego:
        int count = 2;
        while (in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(count + ": " + line);
            count++;
        }

        in.close();
    }
}
