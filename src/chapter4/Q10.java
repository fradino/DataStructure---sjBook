package chapter4;

import java.util.Stack;

public class Q10 {
    public static int akm(int m, int n) {
        class Node implements Cloneable {
            int a;
            int b;

            public Node() {
            }

            public Node(int a, int b) {
                this.a = a;
                this.b = b;
            }

            @Override
            protected Node clone() {
                return new Node(a, b);
            }
        }
        Stack<Node> stack = new Stack<>();
        Node w = new Node();
        int ans = 0;
        w.a = m;
        w.b = n;
        stack.push(w);
        do {
            while (stack.peek().a > 0) {
                while (stack.peek().b > 0) {
                    stack.push(new Node(w.a, --w.b));
                }
                w = stack.pop();
                w.a--;
                w.b = 1;
                stack.push(w);
            }
            w = stack.pop();
            ans = w.b + 1;
            if (!stack.empty()) {
                w = stack.pop();
                w.a--;
                w.b = ans;
                stack.push(w);
            }
        } while (!stack.empty());
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(akm(2, 1));
        ;
    }
}
