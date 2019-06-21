package tutorial.exceptions.multiplyExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {

    // można wyrzucać tylko jeden wyjątek na raz
    public void run() throws IOException, ParseException {

        //throw new IOException();

        throw new ParseException("Error in commant list", 3);
    }

    // TODO 'FileNotFoundException' to klasa córka klasy 'IOException'
    public void input() throws IOException, FileNotFoundException {

    }
}
