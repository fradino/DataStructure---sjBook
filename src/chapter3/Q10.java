package chapter3;

public class Q10 {
    private int len;
    private Node head;

    public static class Node {
        int element;
        Node next;
    }

    public Q10() {
        len = 0;
        head = null;
    }

    public static Q10 merge(Q10 list1, Q10 list2) {
        Q10 newList = new Q10();
        Node temp3 = newList.head;
        Node temp1 = list1.head;
        Node temp2 = list2.head;
        while (temp1 != null && temp2 != null) {
            if (temp1.element < temp2.element) {
                temp3.next = new Node();
                temp3.next.element = temp1.element;
                temp1 = temp1.next;
                temp3 = temp3.next;
            } else {
                temp3.next = new Node();
                temp3.next.element = temp2.element;
                temp2 = temp2.next;
                temp3 = temp3.next;
            }
        }
        if (temp1 == null) {
            while (temp2 != null) {
                temp3.next = new Node();
                temp3.next.element = temp2.element;
                temp2 = temp2.next;
                temp3 = temp3.next;
            }
        } else {
            while (temp1 != null) {
                temp3.next = new Node();
                temp3.next.element = temp1.element;
                temp1 = temp1.next;
                temp3 = temp3.next;
            }
        }
        return newList;
    }
}
