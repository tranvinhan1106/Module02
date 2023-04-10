package ss6_inheritance_to_java.exercise.bai3;

import java.util.Arrays;

public class MovablePoint  extends  Point{
    float xSpeed = 1.0f;
    float ySpeed = 1.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arrMPoint = {xSpeed,ySpeed};
        return arrMPoint;
    }

    @Override
    public String toString() {
        return "MovablePoint "+ super.toString() +
                " speed = ("+ Arrays.toString(getSpeed()) +")";
    }
    public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
