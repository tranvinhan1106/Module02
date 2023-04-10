package ss7_abstract_interface_to_java.erexcise.resizeable;

import ss6_inheritance_to_java.pratice.Shape;

public class Rectangle extends Shape implements Resizeable {
    private double width = 2.0;
    private double length = 3.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    public double getAreaChange(){
        int percent = (int) (Math.random()*101);
        resize(percent);
        System.out.println( "-----Rectangle-----"+"\n"+percent+"%");
        return this.length*this.width;
    }
    @Override
    public String toString() {
        return "Area before change = " + (double) Math.round(getArea() * 1000) / 1000 +"\n"
                +"Area after change  = " +(double) Math.round(getAreaChange() * 1000) / 1000;
    }

    @Override
    public void resize(double percent) {
        this.length=this.length+this.length*percent/100;
        this.width=this.width+this.width*percent/100;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
    }

}
