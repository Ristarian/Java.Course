package tutorial.string.stringBuilder;

public class App {

    public static void main(String[] args) {

        //inefficient way
        String info = "";

        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";

        System.out.println(info);

        //BUILDER
        // more efficient
        StringBuilder sb = new StringBuilder();
        sb.append("My name is Sebastian.");
        sb.append(" ");
        sb.append("I'm a student.");

        System.out.println(sb.toString());

    }
}
