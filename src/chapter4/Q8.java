package chapter4;

import java.util.Scanner;
import java.util.Stack;

public class Q8 {
    private static int sum = 10;

    public static void main(String[] args) {
        //test();
        test2();

    }

    public static void test2() {
        Stack<Integer> stack = new Stack<>();
        while (true) {
            int x;
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            stack.push(x);
            if (x == 0) {
                sum = 0;
                while (!stack.empty()) {
                    sum += stack.pop();
                    System.out.println(sum);
                }
                return;
            }
        }

    }

    public static void test() {
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        if (x == 0) {
            sum = 0;
        } else {
            test();
            sum += x;
        }
        System.out.println(sum);
    }
}
