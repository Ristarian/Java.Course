package tutorial.elementsOfJava.innerNestedClasses;

public class Robot {

    private int id;

    //Inner Class:
    public class Brain{
        public void thing(){
            System.out.println("robot" + id + " is thinking");
        }
    }

    // TODO przez odwołanie do 'static' nie możemy użyć pola 'private int id'
    static class Battery{
        public void charge(){
            System.out.println("Battery charging");
        }
    }

    public Robot(int id) {
        this.id = id;
    }

    public void start(){
        System.out.println("starting robot" + id);

        //Inner Class's object and method
        Brain brain = new Brain();
        brain.thing();

        final String name = "Jack";

        class Temp{
            public void doSometthing(){
                System.out.println("ID is: " + id);
                System.out.println("My name is: " + name);
            }
        }
            Temp temp = new Temp();
            temp.doSometthing();
    }
}
