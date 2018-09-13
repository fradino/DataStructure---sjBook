package chapter3;

public class Q4<T> {
    private int len;
    private Node<T> head;

    public static class Node<T> {
        T element;
        Node next;
    }

    public Node<T> locate(int i) {
        if (i >= len || i < 0) {
            return null;
        }
        int j = 0;
        Node<T> temp = head;
        while (j != i) {
            temp = temp.next;
            j++;
        }
        return temp;
    }

    public int eNumber(T e) {
        Node<T> temp = head;
        int num = 0;
        while (temp.next != null) {
            if (temp.next.element.equals(e)) {
                num++;
            }
            temp = temp.next;
        }
        return num;
    }
}
