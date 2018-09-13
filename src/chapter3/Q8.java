package chapter3;

public class Q8 {
    private int len;
    private Node head;

    public static class Node {
        double element;
        Node next;
    }

    public void derivative() {
        int l = len - 1;
        Node temp = head.next;
        if (len == 0)
            return;
        if (len == 1) {
            len = 0;
            head.next = head;
            return;
        }

        while (temp.next.next != head) {
            temp.element *= l;
            l--;
            temp = temp.next;
        }
        len--;
        temp.next = head;
    }
}
