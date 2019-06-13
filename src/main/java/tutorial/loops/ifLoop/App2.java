package tutorial.loops.ifLoop;

public class App2 {

    public static void main(String[] args) {

        int loop = 0;

        while (loop < 5) {
            System.out.println(loop);

            if (loop == 5) {
                break;
            }
            loop++;

            System.out.println("Running");
        }
    }
}