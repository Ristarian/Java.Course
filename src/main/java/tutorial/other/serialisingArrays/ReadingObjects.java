package tutorial.other.serialisingArrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadingObjects {

    public static void main(String[] args) {
        System.out.println("Reading objects... ");

        try (FileInputStream fs = new FileInputStream("arrays.nom")){
            ObjectInputStream os = new ObjectInputStream(fs);
            Person[] people = (Person[])os.readObject();
            ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();

                System.out.println("List: ");
            for (Person person: people){
                System.out.println(person);
            }

                System.out.println("ArrayList: ");
            for (Person peopleArrayList: peopleList){
                System.out.println(peopleArrayList);
            }

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
