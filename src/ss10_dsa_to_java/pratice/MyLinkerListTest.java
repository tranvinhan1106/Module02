package ss10_dsa_to_java.pratice;

public class MyLinkerListTest {
    public static void main(String[] args) {
        System.out.println("-----TESTING-----");
        MyLinkerList ll = new MyLinkerList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
}
