package tutorial.elementsOfJava.enums;

public class App {

    public static void main(String[] args) {

        Animal animal = Animal.CAT;

        switch (animal){
            case CAT:
                System.out.println("cat");
                break;
            case DOG:
                System.out.println("dog");
                break;
            case MOUSE:
                System.out.println("mouse");
                break;
            default:
                break;
        }

        System.out.println(Animal.CAT);

        System.out.println(Animal.DOG.getClass());

        System.out.println(Animal.DOG instanceof Enum);

        System.out.println(Animal.MOUSE.getName());

        Animal animal2 = Animal.valueOf("CAT");

        System.out.println(animal2);

    }
}
