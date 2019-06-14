package tutorial.elementsOfJava.gettersAndReturnValues;

class Person{
    String name;
    int age;

/*    void speak(){
        System.out.println("My name is" + name);
    }*/

    String getName(){
        return name;
    }

/*    void calculateYearsToRetirement(){
        int yearsLeft = 65 - age;
        System.out.println(yearsLeft);
    }*/

    int calculateYearsToRetirement(){
        int yearsLeft = 65 - age;
        return yearsLeft;
    }

    int getAge(){
        return age;
    }
}

public class App {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Daria";
        person1.age = 23;
        //person1.speak();

        String name = person1.getName();
        int age = person1.getAge();
        int years = person1.calculateYearsToRetirement();

        System.out.println("My name is " + name);
        System.out.println("I'm " + age + " years old.");
        System.out.println("Years till retirement: " + years);



    }
}
