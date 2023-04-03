package ss4_class_object_to_java.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double rootFirst;
    private double rootSecond;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta;
        return delta = (b * b) - (4 * a * c);
    }

    public double getRootFirst() {
        return rootFirst = (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    public double getRootSecond() {
        return rootSecond = (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a , b, c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm :");
            System.out.println(quadraticEquation.getRootFirst());
            System.out.println(quadraticEquation.getRootSecond());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm :");
            System.out.println(quadraticEquation.getRootFirst());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
