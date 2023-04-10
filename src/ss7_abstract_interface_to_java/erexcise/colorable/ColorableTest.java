package ss7_abstract_interface_to_java.erexcise.colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[1];
        shapes[0] = new Square(2.0);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }

    }
}
