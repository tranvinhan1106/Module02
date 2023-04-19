package ss10_dsa_to_java.exercise;

public class MyListTest {
    public static void main(String[] args) {
        MyList mylist = new MyList();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        System.out.println("element 1 " + mylist.get(0));
        System.out.println("element 2 " + mylist.get(1));
        System.out.println("element 3 " + mylist.get(2));
        System.out.println("element 4 " + mylist.get(3));
        System.out.println("=====MYLIST=====");
        mylist.findAll();
    }
}
