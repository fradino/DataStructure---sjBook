package chapter4;

import java.util.Stack;

public class Q5<T> {
    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();

    public void push(T e) {
        stack1.push(e);
    }

    public T pop() {
        if (stack1.empty() && stack2.empty()) {
            System.err.println("empty");
            return null;
        } else if (!stack2.empty()) {
            return stack2.pop();
        } else {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }

    public boolean isEmpty() {
        return stack1.empty() && stack2.empty();
    }

    public static void main(String[] args) {
        Q5<Integer> q5 = new Q5<>();
        q5.push(1);
        q5.push(2);
        q5.push(3);
        System.out.println(q5.pop());
        System.out.println(q5.pop());
        System.out.println(q5.pop());
    }

}
