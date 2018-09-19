package chapter3;

public class Q8 {
    private int len;
    private Node head = new Node(null);

    public static class Node {
        Double element;
        Node next;

        public Node(Double element) {
            this.element = element;
        }
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

        while (temp.next != head) {
            temp.element *= l;
            l--;
            temp = temp.next;
        }
        len--;
        temp.next = head;
    }

    public static void main(String[] args) {
        Q8 q8 = new Q8();
        q8.head.next = new Node(2.0);
        q8.head.next.next = new Node(1.0);
        q8.len = 2;
        q8.head.next.next.next = q8.head;
        q8.derivative();
        System.out.println(q8.head.next.element + "      " + q8.len);
    }
}
