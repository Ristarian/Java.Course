package tutorial.elementsOfJava.classesAndObjects;

class Person {

    String name;
    int age;

}

public class App {

    public static void main(String[] args) {

        // Create a Person object using the Person class
        Person person1 = new Person();
        person1.name = "Sebastian";
        person1.age = 25;


        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Daria";
        person2.age = 24;

        System.out.println(person1.name);

    }
}

