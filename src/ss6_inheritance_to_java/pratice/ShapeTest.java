package ss6_inheritance_to_java.pratice;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red",false);
        System.out.println(shape);
    }
}
