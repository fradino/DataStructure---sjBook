package chapter4;

public class Q4<T> {
    T[] stack;
    int top1;
    int top2;

    public Q4(int size) {
        stack = (T[]) new Object[size];
        top1 = -1;
        top2 = size;
    }

    public boolean stack1Empty() {
        return top1 == -1;
    }

    public boolean stack2Empty() {
        return top2 == stack.length;
    }

    public void addTo1(T e) {
        if (top1 + 1 == top2) {
            System.err.println("it's full");
            return;
        }
        stack[top1 + 1] = e;
        top1++;
    }

    public void addTo2(T e) {
        if (top1 + 1 == top2) {
            System.err.println("it's full");
            return;
        }
        stack[top2 - 1] = e;
        top2--;
    }

    public void pop1() {
        if (stack1Empty()) {
            System.err.println("it's empty");
            return;
        }
        stack[top1] = null;
        top1--;
    }

    public void pop2() {
        if (stack1Empty()) {
            System.err.println("it's empty");
            return;
        }
        stack[top2] = null;
        top2++;
    }

    public static void main(String[] args) {
        Q4<Integer> q4 = new Q4<>(2);
        System.out.println(q4.stack1Empty());
        q4.addTo1(1);
        q4.addTo2(2);
        q4.addTo2(2);
    }
}
