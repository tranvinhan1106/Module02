package ss5_accessmdf_static_to_java.exercise;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("An");
        student.setClasses("A1222I1");
        System.out.println(student.getClasses());
        System.out.println(student.getName());
    }
}
