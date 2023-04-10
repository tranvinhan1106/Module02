package ss7_abstract_interface_to_java.pratice;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicker();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
        }
    }
}
