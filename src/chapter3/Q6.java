package chapter3;

public class Q6<T> {
    private int len;
    private Node<T> head;

    public static class Node<T> {
        T element;
        Node next;
    }

    public void deleteNode(T e) {
        Node<T> temp = head;
        while (temp.next != null) {
            if (temp.next.element.equals(e)) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void inseetNode(T e) {
        Node<T> temp = new Node<>();
        temp.element = e;
        temp.next = head.next;
        head.next = temp;
    }
}
