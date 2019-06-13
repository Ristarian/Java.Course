package tutorial.collections.arrays;

public class App {

    public static void main(String[] args) {

        // prymitywna zmienna o wartości 7
        int value = 7;

        // referencja
        int[] values;

        // skierowanie referencji do utrzmania trzech zmiennych
        values = new int [3];

        System.out.println(values[0] + values[1] + values[2]);

        values [0] = 10;
        values [1] = 20;
        values [2] = 30;

        System.out.println(values[0] + values[1] + values[2]);

        for (int i=0; i<values.length; i++){
            System.out.println(values[i]);
        }

        int[] numbers = {5,6,7};

        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
