package chapter4;

public class Q6<T> {
    T[] queue;
    int front;
    int length;

    public Q6(int size) {
        queue = (T[]) new Object[size];
        front = 0;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return length == queue.length;
    }

    public void push(T e) {
        if (!isFull()) {
            queue[(front + length) % queue.length] = e;
            length++;
        } else {
            System.err.println("it's full");
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.err.println("it's empty");
            return null;
        }
        T temp = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        length--;
        return temp;
    }

    public static void main(String[] args) {
        Q6<Integer> q6 = new Q6<>(3);
        q6.push(1);
        q6.push(2);
        q6.push(3);
        System.out.println(q6.pop());
        System.out.println(q6.pop());
        System.out.println(q6.pop());
        q6.push(1);
        q6.push(2);
        q6.push(3);
        System.out.println(q6.pop());
        System.out.println(q6.pop());
        System.out.println(q6.pop());
    }
}
