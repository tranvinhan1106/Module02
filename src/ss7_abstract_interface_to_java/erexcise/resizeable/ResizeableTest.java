package ss7_abstract_interface_to_java.erexcise.resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0]= new Circle();
        resizeables[1] = new Rectangle();
        resizeables[2] = new Square();
        for (Resizeable resizeable : resizeables){
            System.out.println(resizeable);
        }

    }
}
