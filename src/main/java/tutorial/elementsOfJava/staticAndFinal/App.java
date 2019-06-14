package tutorial.elementsOfJava.staticAndFinal;

//IMPORTANT!
//INSTANCE variables can access static data
//STATIC variables can't access instant data

class Thing {

    //FINAL musi mieć wartość przypisaną np. '12' w tym przypadku
    public static final int LUCKY_NUMBER = 12;

    public String name;

    //STATIC jest przypisana do klasy, nie do obiektu!
    public static String description;

    public static int count = 0;
    public int id;
    public Thing (){
        id = count;
        count++;
    }

    //metoda standardowa
    public void showName(){
        System.out.println(description + id + ": " + name);
    }

    //metoda typu static
    public static void showDescription(){
        System.out.println("Hi");
        // nie będzie działać: System.out.println(name);
        // ponieważ 'name' nie ma 'static' w deklaracji (patrz: 'IMPORTANT' na górze)
    }
}

public class App {

    public static void main(String[] args) {

        Thing.description = "I'am a thing";
        System.out.println(Thing.description);

        Thing.showDescription();

        System.out.println("Before creating any object: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating a objects: " + Thing.count);

        thing1.name = "Sebastian";
        thing2.name = "Daria";

        System.out.println(thing1.name);
        System.out.println(thing2.name);

        thing1.showName();
        thing2.showName();

        //PI JEST FINALNA, NIE MOŻNA PRZYPISAĆ INNEJ WARTOŚCI
        //Math.PI = 3;
        System.out.println(Math.PI);

        System.out.println(Thing.LUCKY_NUMBER);
    }
}
