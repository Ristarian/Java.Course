package tutorial.elementsOfJava.constructors;

//konstruktor to specjalna metoda

class Machine {

    private String name;
    private int code;

    public Machine(){
        name = "Sebastian";
        //this("Sebastian", 1);
        System.out.println("First Constructor running");
    }

    public Machine (String name){
        this.name = name;
        System.out.println("Second constructor running");
    }

    public Machine (String name, int code){
        this.name = name;
        this.code = code;
        System.out.println("Third constructor running");
    }
}

public class App {

    public static void main(String[] args) {

        // first contructors
        Machine machine1 = new Machine();
        new Machine();

        //second constructor
        Machine machine2 = new Machine("Daria");

        //third constructor
        Machine machine3 = new Machine("Sebastian&Daria", 3);

    }
}
