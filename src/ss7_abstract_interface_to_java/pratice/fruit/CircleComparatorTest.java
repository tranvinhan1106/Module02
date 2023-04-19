package ss7_abstract_interface_to_java.pratice.fruit;

import ss6_inheritance_to_java.pratice.Circle;
import ss7_abstract_interface_to_java.pratice.CircleComparator;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("indigo",false,3.5);
        System.out.println("Pre-sorted");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        Comparator comparator  = new CircleComparator();
        Arrays.sort(circles,comparator);
        System.out.println("After-sorted :");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
