package tutorial.other;

import java.util.Scanner;

public class gettingUserInput {

    public static void main(String[] args) {

        //tworzenie obiektu typu Scanner
        Scanner input = new Scanner(System.in);

        //wydanie polecenia
        System.out.println("Enter a value: ");

        //określanie na jaki typ inputu będzie reakcja
        int value = input.nextInt();

        //program informuje o tym jaką wartość podał użytkownik
        System.out.println("You entered: " + value);
    }
}
