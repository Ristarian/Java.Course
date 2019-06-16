package tutorial.elementsOfJava.polymorphism;

public class App {

    public static void main(String[] args) {

        Plant plant = new Plant();
        Tree tree = new Tree();

        tree.givesShadow();

        //Polimorfizm gwarantuje, że możemy użyć klasy córki
        // w każdym miejscu gdzie pojawia się klasa rodzica.
        Plant plantFakeTree = tree;

        plantFakeTree.grow();
        //plantFakeTree.givesShadow();

        doGrow((tree));

    }

    public static void doGrow(Plant plant){
        plant.grow();
    }
}
