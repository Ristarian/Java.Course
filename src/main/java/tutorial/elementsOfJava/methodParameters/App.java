package tutorial.elementsOfJava.methodParameters;

class Robot{

    //nawiasy '()' są tym, czym strzelamy w ramach metody:
    // - możemy wystrzelić konkretną wiadomością; lub
    // - nadać typ zmiennej (parametr) jaką można wystrzelić
    public void speak (String text){
        System.out.println(text);
    }

    public void jump (int height){
        System.out.println("Jumping " + height);
    }

    public void move (String direction, double distance){
        System.out.println("Moving " + distance + " metrs in direction: " + direction);
    }

    public void energy (int amount){
        System.out.println("I have " + amount + " percent in my battery.");
    }
}

public class App {

    public static void main(String[] args) {

        Robot robot1 = new Robot();

        //przekazywanie parametru metodom z klasy robot
        robot1.speak("Hi!");
        robot1.jump(8);
        robot1.move("west", 3.4);
        robot1.energy(60);

        String farewell = "Have a nice day!";
        robot1.speak(farewell);
    }
}
