package tutorial.collections.arraysOfStrings;

public class App {

    public static void main(String[] args) {

        //deklaracja listy (referencji) do stringów
        String[] words = new String[3];

        //ukierunkowanie elementów listy(punktów referencji) to konkretnych wartości
        words[0] = "Hello";
        words[1] = "to";
        words[2] = "You";

        //wydobywanie elementów listy
        System.out.println(words[2]);
        System.out.println(words[0] + " " + words [1] + " " + words [2]);

        //rownoczesne deklarowanie i inicjalisowanie listy stringów
        String[] fruits = {"apple", "banana", "pearl"};

        //ITEROWANIE listy stringów 'fruits'
        //ITERACJA tj. czynność powtarzania tej samej operacji w pętli z góry
        // określoną liczbę razy lub aż do spełnienia określonego warunku
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
