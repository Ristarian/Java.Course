package tutorial.other.serialisation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

    public static void main(String[] args) {
        System.out.println("Writting Object... ");

        Person person1 = new Person(1, "White");
        Person person2 = new Person(2, "Black");

        System.out.println(person1);
        System.out.println(person2);

        try (FileOutputStream fs = new FileOutputStream("people.bin")){
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(person1);
            os.writeObject(person2);
            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
