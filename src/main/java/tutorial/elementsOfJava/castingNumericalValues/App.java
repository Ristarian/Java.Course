package tutorial.elementsOfJava.castingNumericalValues;

public class App {

    public static void main(String[] args) {

        byte byteValue = 127;
        short shortValue = 123;
        int intValue = 888;
        long longValue = 124;

        float floatValues = 12323.83f;
        double doubleValue = 12312.3213;

        System.out.println(Byte.MAX_VALUE);

        // int > long
        intValue = (int)longValue;
        System.out.println(intValue);

        // double > int
        doubleValue = intValue;
        System.out.println(doubleValue);

        // int >fload
        intValue = (int)floatValues;
        System.out.println(intValue);

        // castowanie byte do liczby przekraczającej limit bytea
        //
        byteValue = (byte)138;
        System.out.println(byteValue);
    }
}
