package chapter3;

public class Q7 {
    private int len;
    private Node head;

    public static class Node {
        double element;
        Node next;
    }

    public double calc(double x) {
        int l = len;
        Node temp = head.next;
        double ans = 0;
        while (temp != head) {
            ans += temp.element * Math.pow(x, l - 1);
            l--;
            temp = temp.next;
        }
        return ans;
    }
}
