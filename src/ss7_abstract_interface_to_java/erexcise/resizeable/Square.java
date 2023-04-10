package ss7_abstract_interface_to_java.erexcise.resizeable;

import ss6_inheritance_to_java.pratice.Rectangle;

public class Square extends Rectangle implements Resizeable {
    double side = 2.0d;

    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }


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
    public double getAreaChange(){
        int percent = (int) (Math.random()*101);
        resize(percent);
        System.out.println("------Square------"+"\n"+percent +"%");
        return this.side*this.side*Math.PI;
    }
    @Override
    public String toString() {
        return "Area before change = " + (double) Math.round(getArea() * 1000) / 1000 +"\n"
                +"Area after change  = " + (double) Math.round(getAreaChange() * 1000) / 1000;
    }

    @Override
    public void resize(double percent) {
        this.side = this.side*this.side*percent/100;
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
    }
}