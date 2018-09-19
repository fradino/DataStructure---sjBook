package chapter3;

public class Q5<T> {
    private int len;
    private Node<T> head;

    public static class Node<T> {
        T element;
        Node next;

        public Node(T element) {
            this.element = element;
        }
    }

    public void deleteNode(T e) {
        if (head.element.equals(e)) {
            head = head.next;
            len--;
            return;
        }
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
        temp.next = head;
        head = temp;
    }

    public static void main(String[] args) {
        Q5<Integer> q5 = new Q5();
        q5.head = new Node<>(1);
        q5.head.next = new Node<>(2);
        q5.head.next.next = new Node<>(3);
        q5.inseetNode(10086);
        System.out.println(q5.head.element + "    " + q5.head.next.element);
        q5.deleteNode(1);
        System.out.println(q5.head.element + "    " + q5.head.next.element);
    }
}
