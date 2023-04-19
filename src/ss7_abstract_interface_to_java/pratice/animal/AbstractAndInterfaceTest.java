package ss7_abstract_interface_to_java.pratice.animal;

import ss7_abstract_interface_to_java.pratice.edible.Edible;
import ss7_abstract_interface_to_java.pratice.fruit.Apple;
import ss7_abstract_interface_to_java.pratice.fruit.Fruit;
import ss7_abstract_interface_to_java.pratice.fruit.Orange;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit fruit1 : fruit){
            System.out.println(fruit1.howToEat());
        }
    }
}
