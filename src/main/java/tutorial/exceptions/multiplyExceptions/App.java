package tutorial.exceptions.multiplyExceptions;

        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.text.ParseException;

public class App {

    public static void main(String[] args) {

        Test test = new Test();

        // TODO multiple cath blocks
        // wyjątek jest dopasowany do tego jaki został zastosowany w klasie 'test'
        /*
        try {
            test.run();
        } catch (IOException e) {
            System.out.println("Exception number 1");
        } catch (ParseException e) {
            System.out.println("Exception number 2");
        }*/


        // TODO Try multi-catch (Java 7+ only)
        /*
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }*/


        // TODO Using polymorphism to catch the parent of all exceptions
        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // TODO First we need to catch child exception ('FileNotFoundException'),
        //  only then we are able to catch parent exception ('IOException')
        try {
            test.input();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
