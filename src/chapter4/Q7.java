package chapter4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(1);
        System.out.println("输入指数（》=3）");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("1\n1 1");
        for (int i = 0; i < num - 2; i++) {
            Queue<Integer> q2 = new LinkedList<>();
            q2.add(1);
            while (!q1.isEmpty()) {
                int a = q1.remove();
                if (q1.isEmpty())
                    q2.add(1);
                else
                    q2.add(a + q1.peek());
            }
            q2.forEach(integer -> System.out.print(integer + " "));
            System.out.println();
            q1 = q2;
        }
    }
}
