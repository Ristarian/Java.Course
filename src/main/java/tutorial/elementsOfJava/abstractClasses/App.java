package tutorial.elementsOfJava.abstractClasses;

public class App {

    public static void main(String[] args) {

        Camera camera = new Camera();
        camera.setId(5);

        Car car = new Car();
        car.setId(1);

        camera.run();
        System.out.println(" ");
        car.run();

    }

}

