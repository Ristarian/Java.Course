package tutorial.elementsOfJava.interfaces;

public class Person implements Info {

    private String name;

    public Person (String name){
        this.name = name;
    }

    public void start(){
        System.out.println("Person started work.");
    }

    @Override
    public void showInfo() {
        System.out.println("Some data of Person");
    }
}
