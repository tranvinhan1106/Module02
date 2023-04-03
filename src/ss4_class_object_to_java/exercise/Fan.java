package ss4_class_object_to_java.exercise;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue ";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
      if (on){
          return "Speed = "+this.speed +", color = "+this.color+", radius = "+this.radius+", fan is on !";
      }else {
          return "Speed = "+this.speed +", color = "+this.color+", radius = "+this.radius+", fan is off !";
      }
    }

    public static void main(String[] args) {
        Fan fan =new Fan(FAST,true,10,"Yellow");
        Fan fan1 =new Fan(MEDIUM,false,5,"Blue");
        System.out.println(fan);
        System.out.println(fan1);
    }
}
