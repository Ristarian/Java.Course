package tutorial.elementsOfJava.anonymousClasses;

class Animal{
    public void start(){
        System.out.println("Animal leaves cage.");
    }
}

interface Plant {
    public void grow ();
}

public class App {

    public static void main(String[] args) {

        Animal animal = new Animal(){ // tutaj jest klasa dziedzicząca w pewnym sensie (czyli tzw. aninomowa)

            @Override public void start(){
                System.out.println("Animal is still in cage.");
            }
        };

        animal.start();

        Plant plant = new Plant(){

            @Override // adnotacja nie jest konieczna
            public void grow() {
                System.out.println("Plant is growing.");
            }
        };

        plant.grow();
    }
}
