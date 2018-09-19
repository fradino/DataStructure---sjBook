package chapter3;

public class Q7 {
    private int len;
    private Node head = new Node(null);

    public static class Node {
        Double element;
        Node next;

        public Node(Double element) {
            this.element = element;
        }
    }

    public double calc(double x) {
        int l = len;
        Node temp = head.next;
        double ans = 0;
        while (temp != head) {
            System.out.println(temp.element);
            ans += temp.element * Math.pow(x, l - 1);
            l--;
            temp = temp.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        Q7 q7 = new Q7();
        q7.head.next = new Node(2.0);
        q7.head.next.next = new Node(1.0);
        q7.len = 2;
        q7.head.next.next.next = q7.head;
        System.out.println(q7.calc(5));
    }
}
