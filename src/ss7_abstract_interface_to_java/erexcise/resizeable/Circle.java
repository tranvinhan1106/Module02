package ss7_abstract_interface_to_java.erexcise.resizeable;

import ss6_inheritance_to_java.pratice.Shape;

public class Circle extends Shape implements Resizeable {

    private double radius = 2.0 ;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public double getAreaChange(){
        int percent = (int) (Math.random()*101);
        resize(percent);
        System.out.println("-----Circle-----"+"\n"+percent+"%");
        return this.radius*this.radius;
    }
    @Override
    public String toString() {
        return "Area before change = " + (double) Math.round(getArea() * 1000) / 1000 +"\n"
                +"Area after change  = " + (double) Math.round(getAreaChange() * 1000) / 1000;
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius *this.radius *percent/100;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
    }
}
