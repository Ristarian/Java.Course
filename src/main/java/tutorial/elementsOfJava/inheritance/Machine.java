package tutorial.elementsOfJava.inheritance;

public class Machine {

    // private jest dostępne tylko w tej klasie
    // protected jest dostępne w pakiecie i w dzieciach tej klasy
    protected String name = "Machine v1";

    public void start(){
        System.out.println("Machine started");
    }

    public void stop(){
        System.out.println("Machine stopped");
    }
}
