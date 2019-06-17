package tutorial.elementsOfJava.generics;

import java.util.ArrayList;
import java.util.HashMap;

public class App {

    public static void main(String[] args) {

        //Do tworzenia klas przy wykorzystaniu typów generycznych
        // korzystamy z tak zwanego operatora diamentowego <>

        //Aby utworzyć klasę parametryzowaną typem generycznym
        // musimy podać interesujący nas typ w diamencie <Typ>
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("owl");

        String animal = strings.get(0);

        System.out.println(animal);


        // Można tworzyć więcej niż jeden rodzaj argumentu
        HashMap<Integer, String> map = new HashMap<Integer, String>();

    }

}
