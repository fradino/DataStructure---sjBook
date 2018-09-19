package chapter3;

public class Q4<T> {
    private int len;
    private Node<T> head = new Node<>(null);

    public static class Node<T> {
        T element;
        Node next;

        public Node(T element) {
            this.element = element;
        }
    }

    public Node<T> locate(int i) {
        if (i > len || i <= 0) {
            return null;
        }
        int j = 0;
        Node<T> temp = head;
        while (j != i) {
            temp = temp.next;
            j++;
        }
        return temp;
    }

    public int eNumber(T e) {
        Node<T> temp = head;
        int num = 0;
        while (temp.next != null) {
            if (temp.next.element.equals(e)) {
                num++;
            }
            temp = temp.next;
        }
        return num;
    }

    public static void main(String[] args) {
        Q4<Integer> q4 = new Q4();
        q4.head.next = new Node<>(1);
        q4.head.next.next = new Node<>(2);
        q4.head.next.next.next = new Node<>(3);
        q4.len += 3;
        System.out.println(q4.locate(3).element);
        System.out.println(q4.eNumber(1));
    }
}
