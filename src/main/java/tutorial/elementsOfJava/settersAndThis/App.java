package tutorial.elementsOfJava.settersAndThis;

class Dog{

    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge (int age){
        this.age = age;
    }

    public void setInfo (String name, int age){
        setName(name);
        setAge(age);
    }
}

public class App {

    public static void main(String[] args) {

        Dog dog = new Dog();

        //dog.name = "Bertie";
        //dog.age = 2;

        dog.setName("Bertie");
        dog.setAge(2);

        dog.setInfo("newBertie", 3);

        System.out.println(dog.getName());

    }
}
