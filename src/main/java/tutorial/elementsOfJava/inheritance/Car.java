package tutorial.elementsOfJava.inheritance;

public class Car extends Machine{

    @Override
    public void start() {
        System.out.println("Car started");

    }

    public void cleaningWindshield(){
        System.out.println("Wiping windshield");
    }

    public void showInfo(){
        System.out.println("Car name: " + name);
    }
}
