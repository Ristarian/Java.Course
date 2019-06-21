package tutorial.exceptions.runtimeExceptions;

public class App {

    public static void main(String[] args) {

        //TODO checked exceptions są wyjątkami, które trzeba obsłużyć
        try {
            Thread.sleep(111);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //TODO runtime exception są wyjątkami, które nie trzeba obsługiwać
        /*
        int value = 7;
        value = value/0;
        */
        //TODO NullPointerException poniżej
        /*
        String text = null;
        System.out.println(text.length());
        */

        String[] texts = {"one", "two"};
        try {
            System.out.println(texts[2]);
//       } catch (Exception e){
//       } catch (RuntimeException e){
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }
}
