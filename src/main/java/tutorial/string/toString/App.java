package tutorial.string.toString;

//class Object {}

class Frog1 {

    public String toString (){
        return "text1";
    }

    public String method(){
        return "text2";
    }
}

class Frog2{}

class Frog3{

    private int id;
    private String name;

    public Frog3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString (){
        return id + ": " + name;
    }

    public String method (){
        return id + ": " + name;
    }
}

class Frog4 {
    private int id;
    private String name;

    public Frog4(int id, String name) {
        this.id = id;
        this.name = name;
    }

        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(id).append(": ").append(name);
            return sb.toString();
        }
    }

class Frog5{
    private int id;
    private String name;

    public Frog5(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return String.format("%d: %s", id, name);
    }
}

public class App {

    public static void main(String[] args) {

/*        Object object = new Object();
        object.toString();*/

        Frog1 frog1 = new Frog1();
        System.out.println(frog1);
        System.out.println(frog1.method());
        System.out.println(frog1.toString());

        Frog2 frog2 = new Frog2();
        System.out.println(frog2); //2@3b6eb2ec - hashCode (unikatowy identyfikator dla obiektu)

        Frog3 frog3 = new Frog3(3, "Alfa of Frog3");
        System.out.println(frog3);

        Frog4 frog4 = new Frog4(4, "Alfa of Frog4");
        System.out.println(frog4);

        Frog5 frog5 = new Frog5(5, "Alfa of Frog5");
        System.out.println(frog5);
    }
}
