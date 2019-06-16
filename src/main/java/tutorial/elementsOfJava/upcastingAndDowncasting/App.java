package tutorial.elementsOfJava.upcastingAndDowncasting;

class Machine{
    public void startMachine(){
        System.out.println("Machine started");
    }
}

class Camera extends Machine{
    public void UseCamera() {
        System.out.println("Photo taken");
    }
}

public class App {

    public static void main(String[] args) {

        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.startMachine();
        camera1.startMachine();
        camera1.UseCamera();

        //Upcasting (wskoczyliśmy wyżej w klasie z Camera do Machine)
        // poprzez przypisane zmiennej typu Kamera to zmiennej typu Machina
        Machine machine2 = camera1; // polymorphism
        machine2.startMachine();
        // machine2.UseCamera()
        // metody są przetrzymywane w obiekcie, a nie w zmiennej,
        // dlatego metoda z obiektu Kamera nie zadziała

        //Downcasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3; // potwierdzamy Javie, że świadomi tego co robimy
        camera2.startMachine();
        camera2.UseCamera();

        Machine machine4 = new Machine();
        //Camera camera3 = (Camera)machine4;
        //camera3.start();
        //camera3.UseCamera();
    }
}
