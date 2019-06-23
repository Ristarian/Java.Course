package tutorial.collections.p5_HashSetAndSets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        //TODO HashSet nie pamięta kolejności
        Set<String> set1 = new HashSet<>();
        set1.add("vodka");
        set1.add("beer");
        set1.add("wine");

        //dodawanie duplikatów, w przeciwieństwie do listy nie ma na nic wpływu
        set1.add("wine");

        //TODO LinkedHashSEt pamięta kolejność
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("vodka");
        set2.add("beer");
        set2.add("wine");

        //dodawanie duplikatów, w przeciwieństwie do listy nie ma na nic wpływu
        set2.add("wine");

        //TODO TreeHashSet ustawia kolejność naturalną (np. alfabet)
        Set<String> set3 = new TreeSet<>();
        set3.add("vodka");
        set3.add("beer");
        set3.add("wine");

        //dodawanie duplikatów, w przeciwieństwie do listy nie ma na nic wpływu
        set3.add("wine");

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        for (String element: set1){
            System.out.println(element);
        }

        if (set1.contains("beer")){
            System.out.println("HashSet includes beer.");
        }

        set2.add("bourbon");
        set2.add("rum");

        //TODO wykazanie wspólnych elementów między HashSet i LinkedHashSet
        Set<String>intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        //TODO wykazanie elementów, które są w LinkedHashSet, a nie ma w HashSet
        Set<String>differences = new HashSet<>(set2);
        differences.removeAll(set1);
        System.out.println(differences);

    }
}
