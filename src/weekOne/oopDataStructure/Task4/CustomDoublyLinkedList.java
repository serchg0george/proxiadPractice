package weekOne.oopDataStructure.Task4;

import java.util.ArrayList;
import java.util.List;

public class CustomDoublyLinkedList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;

    private List<Node<T>> elements;


    public CustomDoublyLinkedList() {
        setElements(new ArrayList<>());
    }

    public List<Node<T>> getElements() {
        return elements;
    }

    public void setElements(List<Node<T>> elements) {
        this.elements = elements;
    }


    public void insertFirstNode(T data) {
        Node<T> newNode = new Node<>(data);

        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            newNode.setNext(firstNode);
            firstNode.setPrev(newNode);
            firstNode = newNode;
        }

        elements.add(newNode);
    }


    public void insertLastNode(T data) {
        Node<T> newNode = new Node<>(data);

        if (lastNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            newNode.setPrev(lastNode);
            lastNode.setNext(newNode);
            lastNode = newNode;
        }

        elements.add(newNode);
    }

    public void removeFirst() {
        if (firstNode != null) {
            Node<T> temp = firstNode;
            firstNode = firstNode.getNext();
            if (firstNode != null) {
                firstNode.setPrev(null);
            } else {
                lastNode = null;
            }
            temp.setNext(null);
            temp.setPrev(null);
            elements.remove(temp);
        }
    }

    public void removeLast() {
        if (lastNode != null) {
            Node<T> temp = lastNode;
            lastNode = lastNode.getPrev();
            if (lastNode != null) {
                lastNode.setNext(null);
            } else {
                firstNode = null;
            }
            temp.setPrev(null);
            temp.setNext(null);
            elements.remove(temp);
        }
    }


    public void print() {
        for (Node<T> node : elements) {
            if (node.getNext() != null) {
                System.out.println(node.getData() + " and the next elements data is: " + node.getNext().getData());
            } else {
                System.out.println(node.getData() + " and this is the last element");
            }
        }
    }
}
