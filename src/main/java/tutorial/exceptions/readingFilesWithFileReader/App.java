package tutorial.exceptions.readingFilesWithFileReader;

import java.io.*;

public class App {

    public static void main(String[] args) {

        File file = new File("test.txt");

        BufferedReader bufferedReader = null;

        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            // TODO Czytanie za pomocą pętli while zawartości pliku test.txt
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file" + file.toString());

            // TODO finally block zawsze będzie wykonany
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Unable to close the file: " + file.toString());
            } catch (NullPointerException ex) {
                // TODO plik nie był otwarty nigdy
            }
        }
    }
}