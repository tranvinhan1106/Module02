package ss5_accessmdf_static_to_java.exercise;

public class TestCircle {
    public static void main(String[] args) {
        System.out.println("Mặc định !");
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        System.out.println("Khởi tạo lại !");
        circle = new Circle(2.0);
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
    }
}
