package tutorial.elementsOfJava.incapsulation;


// Enkapsulacja (ang. encapsulation), czy inaczej hermetyzacja
// to sposób na ukrycie szczegółów implementacji klasy.


class Plant {

    // zwykle tylko statif final są public
    public static final int ID = 7;

    // instancje zmiennych powinny być zadeklarowane jako provate
    // albo przynajmniej jako protected
    private String name;

    // tylko metody w założeniu majace działać poza klasą
    // powinny być public.
    public String getData(){
        String data = "some data" + getCalculation();
        return data;
    }

    // metody używane tylko w danej klasie powinny być private
    private int getCalculation(){
        return 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class App {

    public static void main(String[] args) {


    }
}
