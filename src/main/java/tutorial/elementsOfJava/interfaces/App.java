package tutorial.elementsOfJava.interfaces;

public class App {

    public static void main(String[] args) {

        Machine machine1 = new Machine();
        machine1.start();
        //machine1.showInfo();

        Person person1 = new Person("Daria");
        person1.start();
        //person1.showInfo();

        System.out.println();

        Info info1 = new Machine();
        info1.showInfo();

        Info info2 = new Person("Sebastian");
        info2.showInfo();

        outputShowInfo(machine1);
        outputShowInfo(person1);
    }

    private static void outputShowInfo (Info info){
        info.showInfo();
    }
}
