package week_one.oopDataStructure.Task4;

public class Task4DoublyLinkedList {
    public static void main(String[] args) {
        CustomDoublyLinkedList<Integer> doublyLinkedList = new CustomDoublyLinkedList<>();

        doublyLinkedList.insertLastNode(1);
        doublyLinkedList.insertLastNode(1123);
        doublyLinkedList.insertFirstNode(11);

        doublyLinkedList.print();

        System.out.println("---------------------------------------");

        doublyLinkedList.removeFirst();
        doublyLinkedList.print();

        System.out.println("---------------------------------------");

        doublyLinkedList.removeLast();
        doublyLinkedList.print();
    }
}

