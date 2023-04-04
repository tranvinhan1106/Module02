package ss5_accessmdf_static_to_java.exercise;

public class Student {
    private String name = "John ";
    private String classes = "C02";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Student() {
    }

    public Student(String name, String clas) {
        this.name = name;
        this.classes = clas;
    }
}
