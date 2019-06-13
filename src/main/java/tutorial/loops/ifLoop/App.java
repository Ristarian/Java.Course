package tutorial.loops.ifLoop;

public class App {

    public static void main(String[] args) {

/*        boolean condition = 3 > 8;

        System.out.println(condition);*/

        int myInt = 20;

        if (myInt < 10) {
            System.out.println("Yes, its true");
        }
        else if(myInt > 20){
            System.out.println("No, its false");
        }
        else{
            System.out.println("All of the conditions are false");
        }
    }
}
