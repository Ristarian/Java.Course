package tutorial.collections.p3_HashMap;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(3, "three");
        map.put(4, "four");
        map.put(1, "one");
        map.put(0, "null");
        map.put(5, "five");
        map.put(2, "two");

        String text = map.get(2);

        System.out.println(text);

        for (Map.Entry<Integer, String> entry: map.entrySet()){
            //int key = entry.getKey();
            //Object value = entry.getValue();

            //System.out.println(key + ": " + value);
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }
    }
}
