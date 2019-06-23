package tutorial.collections.p4_SortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {

        //TODO HashMap automatycznie ustawia wartości w kolejności
        HashMap<Integer, String> hashMap = new HashMap<>();

        //TODO LinkedList zachowuje kolejność narzucą przez użytkownika
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        //TODO pozwala ustalić własną kolejność
        TreeMap<Integer, String > treeMap = new TreeMap<>();

        System.out.println("HashMap: ");
        testMap(hashMap);
        System.out.println(" ");

        System.out.println("LinkedHashMap: ");
        testMap(linkedHashMap);
        System.out.println(" ");

        System.out.println("TreeMap: ");
        testMap(treeMap);
        System.out.println(" ");
    }

    public static void testMap(Map<Integer, String> map){

        map.put(4, "beer");
        map.put(6, "coke");
        map.put(0, "water");
        map.put(2, "tea");
        map.put(1, "guanabana juice");

        for (Integer key: map.keySet()){
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
