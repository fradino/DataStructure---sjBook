package chapter3;

public class Q9<T> {
    private int len;
    private Node head = new Node(null, null);

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

        public Node(T element, Node previous) {
            this.element = element;
            this.previous = previous;
            this.freq = 0;
        }
    }

    public void locate(T e) {
        Node temp = head.next;
        while (temp != null) {
            if (temp.element.equals(e)) {
                temp.freq++;
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("didnt find");
            return;
        }

        while (temp.previous != null) {
            if (temp.freq > temp.previous.freq) {
                Node t2 = temp.previous;
                temp.previous = t2.previous;
                t2.previous.next = temp;
                t2.next = temp.next;
                if (t2.next != null) {
                    temp.next.previous = t2;
                }
                temp.next = t2;
                t2.previous = temp;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Q9<Integer> q9 = new Q9();
        q9.head.next = new Node(1, q9.head);
        q9.head.next.next = new Node(2, q9.head.next);
        q9.head.next.next.next = new Node(3, q9.head.next.next);
        q9.len = 3;
        System.out.println(q9.head.next.element + "   " + q9.head.next.next.element + "      " + q9.head.next.next.next.element);
        q9.locate(3);
        System.out.println(q9.head.next.element + "   " + q9.head.next.next.element + "      " + q9.head.next.next.next.element);
    }

}
