package tutorial.elementsOfJava.abstractClasses;

// klasa może tylko jedną klasę abstrakcyjną włączyć
public class Camera extends Machine {

    @Override
    public void start() {
        System.out.println("starting camera");
    }

    @Override
    public void working() {
        System.out.println("recording");
    }

    @Override
    public void shutDown() {
        System.out.println("shutting down a camera");
    }
}
