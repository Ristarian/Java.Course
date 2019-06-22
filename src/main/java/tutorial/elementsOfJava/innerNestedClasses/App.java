package tutorial.elementsOfJava.innerNestedClasses;

public class App {

    public static void main(String[] args) {

        Robot robot = new Robot(7);
        robot.start();


        Robot.Brain brain = robot.new Brain();
        brain.thing();

        //nie zadziała: Robot.Battery battery = robot.new Battery();
        Robot.Battery battery = new Robot.Battery();
        battery.charge();
    }
}
