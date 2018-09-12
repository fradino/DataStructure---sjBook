package chapter3;

import java.util.List;

public class Q3 {
    public static <T extends Comparable<T>> void reverseArray(T[] array) {
        int len = array.length;
        int halfLen = len / 2;
        for (int i = 0; i < halfLen; i++) {
            T temp = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = temp;
        }
    }

    public static <T extends Comparable<T>> Node<T> reverseList(Node<T> head) {
        Node<T> p = head;
        if (p == null) {
            return head;
        }
        Node<T> q = p.next, t = q.next;
        while (q != null) {
            q.next = p;
            p = q;
            q = t;
            if (t != null) {
                t = t.next;
            }
        }
        return p;
    }

}

class Node<T extends Comparable<T>> {
    T element;
    Node next;
}
