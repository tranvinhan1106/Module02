package ss6_inheritance_to_java.pratice;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }
//    public Square(double side, String color, boolean filled) {
//        super(side, side, color, filled);
//    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
