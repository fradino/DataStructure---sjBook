package chapter3;

import java.util.Arrays;
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
        head.next = null;
        return p;
    }

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        head.next = new Node<>(2);
        head.next.next = new Node<>(3);
        System.out.println(head.element + "   " + head.next.element + "    " + head.next.next.element);
//        for (Node n=head;n!=null;n=n.next){
//            System.out.println(n.element);
//        }
        head = reverseList(head);
//        for (Node n=head;n!=null;n=n.next){
//            System.out.println(n.element);
//        }
        System.out.println(head.element + "   " + head.next.element + "    " + head.next.next.element);


        Integer[] a = new Integer[]{1, 2, 3, 4, 5};
        reverseArray(a);
        System.out.println(Arrays.toString(a));
    }


}

class Node<T extends Comparable<T>> {
    T element;
    Node next;

    public Node(T element) {
        this.element = element;
    }
}
