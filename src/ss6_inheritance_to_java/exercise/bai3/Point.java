package ss6_inheritance_to_java.exercise.bai3;

public class Point {
    float x = 2.0f;
    float y = 2.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] array = {x,y};
        return array;
    }

    @Override
    public String toString() {
        return "("+ "x,y) =" +"{"+x
        + ","+y +"}";
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
    }
}
