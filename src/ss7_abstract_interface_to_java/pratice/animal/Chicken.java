package ss7_abstract_interface_to_java.pratice.animal;


import ss7_abstract_interface_to_java.pratice.edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken : cluck-cluck !";
    }

    @Override
    public String howToEat() {
        return "could be fried ";
    }
}
