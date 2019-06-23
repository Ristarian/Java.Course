package tutorial.collections.p1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Pusta lista: ");
        System.out.println(numbers);

        // dodawanie
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);

        // uzyskiwanie
        System.out.println("Uzyskiwanie: ");
        System.out.println(numbers.get(0));
        System.out.println(numbers);

        // iteracja
        System.out.println("Iteracja pierwsza:");
        for (int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        System.out.println("Iteracja druga:");
        for (Integer value: numbers){
            System.out.println(value);
        }

        // usuwnaie
        System.out.println("Usuwanie:");
        numbers.remove(numbers.size()-1);
        numbers.remove(0);

        System.out.println(numbers);

        // interfejs
        List values = new ArrayList<String>();
        values.add(1);
        System.out.println("Interfejsowa lista: ");
        System.out.println(values);
    }
}
