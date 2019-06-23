package tutorial.elementsOfJava.equalsAndComparingStrings;

import java.util.Objects;

class Person {

    private int id;
    private String name;

    Person (int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class App {

    public static void main(String[] args) {

        Person person1 = new Person (1, "Sebastian");
        Person person2 = new Person (2, "Daria");

        // TODO Equals sprawdza czy dwie referencje do obiektu są takie same
        // TODO w tym przypadku wynik będzie 'false'
        // TODO Wynik będzie 'true' jeśli dopiszemu natępującą linijkę kodu:
        // TODO person1 = person2;
        System.out.print("person1 == person2: ");
        System.out.println(person1 == person2);

        // TODO Nawet jeśli parametry będą takie to equals wciąż wykaże 'false'
        // TODO To są wciąż dwa różne obiektu w pamięci maszyny
        Person person3 = new Person (1, "Sebastian");
        Person person4 = new Person (1, "Sebastian");
        System.out.print("person3 == person4: ");
        System.out.println(person3 == person4);

        // TODO Jak je porównać w odniesieniu do referencji? Trzeba użyć metody equals()
        // TODO Nadpisane metody 'equal' i 'hashCode' umożliwyły to
        System.out.print("person3.equals(person4): ");
        System.out.println(person3.equals(person4));

        Double value1 = 7.2;
        Double value2 = 7.2;
        System.out.print("value1 == value: ");
        System.out.println(value1 == value2);

        Integer number1 = 3;
        Integer number2 = 3;
        System.out.print("number1 == number2: ");
        System.out.println(number1 == number2);

        String text1 = "Hello";
        String text2 = "Hellodfadf".substring(0, 5);
        System.out.println(text2);

        System.out.print("ext1.equals(text2): ");
        System.out.println(text1.equals(text2));
    }
}
