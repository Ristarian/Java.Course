package tutorial.other.serialisingArrays;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WritingObjects {

    public static void main(String[] args) {
        System.out.println("Writing objecrs...");

        Person[] people = {
                new Person(1, "Sebastian"),
                new Person(2, "Daria"),
                new Person(3, "dog")};

        ArrayList<Person> peopleList = new ArrayList<>(Arrays.asList(people));

        try (FileOutputStream fs = new FileOutputStream("arrays.nom")) {
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(people);
            os.writeObject(peopleList);
            os.writeInt(peopleList.size());
            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
