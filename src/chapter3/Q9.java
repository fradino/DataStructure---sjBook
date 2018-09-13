package chapter3;

public class Q9<T> {
    private int len;
    private Node head;

    public Q9() {
        head.freq = Integer.MAX_VALUE;
        head.previous = null;
        head.next = null;
        head.element = null;
    }


    public static class Node<T> {
        T element;
        Node next;
        Node previous;
        int freq;

    }

    public void locate(T e) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.element.equals(e)) {
                temp.next.freq++;
                break;
            }
            temp = temp.next;
        }
        if (temp.next == null)
            return;
        temp = temp.next;
        while (temp.previous != null) {
            if (temp.freq > temp.previous.freq) {
                Node t2 = temp.previous;
                temp.previous = t2.previous;
                t2.previous.next = temp;
                t2.next = temp.next;
                temp.next.previous = t2;
                temp.next = t2;
                t2.previous = temp;
            } else {
                break;
            }
        }
    }

}
