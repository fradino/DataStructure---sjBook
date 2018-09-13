package chapter3;

public class Q5<T> {
    private int len;
    private Node<T> head;

    public static class Node<T> {
        T element;
        Node next;
    }

    public void deleteNode(T e) {
        if (head.element.equals(e)) {
            head = head.next;
            len--;
            return;
        }
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
        temp.next = head;
        head = temp;
    }
}
