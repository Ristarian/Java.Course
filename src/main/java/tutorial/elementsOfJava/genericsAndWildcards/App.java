package tutorial.elementsOfJava.genericsAndWildcards;

import java.util.ArrayList;

class Machine{
    @Override
    public String toString() {
        return "Machine";
    }
}

class Car extends Machine{

}

public class App {

    public static void main(String[] args) {

        ArrayList<Machine> list = new ArrayList<Machine>();

        list.add(new Machine());
        list.add(new Machine());
        showList(list);
    }


    public static void showList(ArrayList<? extends Machine> list){
        for(Machine value: list){
            System.out.println(value);
        }
    }
}
