package ss6_inheritance_to_java.exercise.bai1;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3.0, "red", 2.0);
        System.out.println(cylinder);
    }
}
