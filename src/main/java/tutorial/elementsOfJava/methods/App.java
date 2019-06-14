package tutorial.elementsOfJava.methods;

class Person {

    String name;
    int age;

    void speak() {
      System.out.println("Hello, my name is: " + name + " and I'm " + age + " years old.");
    }
}

public class App {

    public static void main(String[] args) {

        // Create a Person object using the Person class
        Person person1 = new Person();
        person1.name = "Sebastian";
        person1.age = 25;
        person1.speak();


        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Daria";
        person2.age = 24;
        person2.speak();
    }
}
