package chapter3;

public class Q10 {
    private int len;
    private Node head;

    public static class Node {
        int element;
        Node next;

        public Node(int element) {
            this.element = element;
        }
    }

    public Q10() {
        len = 0;
        head = null;
    }

    public static Q10 merge(Q10 list1, Q10 list2) {
        Q10 newList = new Q10();
        Node temp3 = newList.head = new Node(0);
        Node temp1 = list1.head;
        Node temp2 = list2.head;
        while (temp1 != null && temp2 != null) {
            if (temp1.element < temp2.element) {
                temp3.next = new Node(0);
                temp3.next.element = temp1.element;
                temp1 = temp1.next;
                temp3 = temp3.next;
            } else {
                temp3.next = new Node(0);
                temp3.next.element = temp2.element;
                temp2 = temp2.next;
                temp3 = temp3.next;
            }
        }
        if (temp1 == null) {
            while (temp2 != null) {
                temp3.next = new Node(0);
                temp3.next.element = temp2.element;
                temp2 = temp2.next;
                temp3 = temp3.next;
            }
        } else {
            while (temp1 != null) {
                temp3.next = new Node(0);
                temp3.next.element = temp1.element;
                temp1 = temp1.next;
                temp3 = temp3.next;
            }
        }
        newList.head = newList.head.next;
        return newList;
    }

    public static void main(String[] args) {
        Q10 q10_1 = new Q10();
        q10_1.head = new Node(1);
        q10_1.head.next = new Node(3);
        q10_1.len = 2;
        Q10 q10_2 = new Q10();
        q10_2.head = new Node(2);
        q10_2.head.next = new Node(4);
        q10_2.len = 2;
        Q10 n = merge(q10_1, q10_2);
        System.out.println(n.head.element + "   " + n.head.next.element + "     " + n.head.next.next.element + "      " + n.head.next.next.next.element);
    }
}
