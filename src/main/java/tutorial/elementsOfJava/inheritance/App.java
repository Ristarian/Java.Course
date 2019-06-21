package tutorial.elementsOfJava.inheritance;

public class App {


    public static void main(String[] args) {

        Machine machine1 = new Machine();

        machine1.start();
        machine1.stop();

        Car car1 = new Car();
        car1.start();
        car1.stop();
        car1.cleaningWindshield();
        car1.showInfo();

    }
}
