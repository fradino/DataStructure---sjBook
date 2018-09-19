package chapter3;

public class Q6<T> {
    private int len;
    private Node<T> head = new Node<>(null);

    public static class Node<T> {
        T element;
        Node next;

        public Node(T element) {
            this.element = element;
        }
    }

    public void deleteNode(T e) {
        Node<T> temp = head;
        while (temp.next != null) {
            if (temp.next.element.equals(e)) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void inseetNode(T e) {
        Node<T> temp = new Node<>(e);
        temp.next = head.next;
        head.next = temp;
    }

    public static void main(String[] args) {
        Q6<Integer> q6 = new Q6();
        q6.head.next = new Node<>(1);
        q6.head.next.next = new Node<>(2);
        q6.head.next.next.next = new Node<>(3);
        q6.inseetNode(10086);
        System.out.println(q6.head.next.element + "    " + q6.head.next.next.element);
        q6.deleteNode(1);
        System.out.println(q6.head.next.element + "    " + q6.head.next.next.element);
    }
}
