package tutorial.collections.p2_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        //TODO dodawanie/usuwanie elementów NA KOŃCU LISTY - ArrayList
        // ArrayList zarządza listą wewnętrznie
        ArrayList<Integer> arrayList = new ArrayList<>();
        //TODO dodawanie/usuwanie elementów na początku lub w środku - LinkedList
        // LinkedList zawiera elementy, w którym, każdy element ma referencję
        // do poprzedniego i następnego elementu
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Dodawanie elementów na koniec listy: ");
        doTiming("ArrayList", arrayList);
        doTiming("Linkedlist", linkedList);

        System.out.println(" ");
        System.out.println("Dodawanie elementu na początek listy: ");
        doTiming2("ArrayList", arrayList);
        doTiming2("Linkedlist", linkedList);
    }

    private static void doTiming(String type, List<Integer> list) {


        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        //TODO TESTS
        long start = System.currentTimeMillis();

        //TODO dodawanie elementów na koniec listy
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("time taken: " + (end - start) + " ms for " + type);
    }

    private static void doTiming2(String type, List<Integer> list) {

        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        //TODO TESTS
        long start = System.currentTimeMillis();

        //TODO dodawanie elementu na początek listy
        for (int i = 0; i < 1E5; i++){
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println("time taken: " + (end - start) + " ms for " + type);
    }
}
