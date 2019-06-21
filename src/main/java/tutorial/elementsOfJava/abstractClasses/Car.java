package tutorial.elementsOfJava.abstractClasses;

public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("starting car");
    }

    @Override
    public void working() {
        System.out.println("driving");
    }

    @Override
    public void shutDown() {
        System.out.println("shutting down a car");
    }
}

