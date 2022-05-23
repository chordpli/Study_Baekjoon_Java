package study08;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Number_10828 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>(); //  int형 스택 선언

        // 주어지는 명령의 수 N
        int N = sc.nextInt();
        sc.nextLine(); // 개행 문자 오류 방지

        for (int i = 0; i < N; i++) {
            String input = sc.next();

            if (input.equals("push")) {
                int num = sc.nextInt();
                stack.push(num);
                sc.nextLine(); // 개행 문자 오류 방지
            } else if (input.equals("pop")) {
                if (stack.empty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                    stack.pop();
                }
            } else if (input.equals("size")) {
                System.out.println(stack.size());
            } else if (input.equals("empty")) {
                if (stack.empty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (input.equals("top")) {
                if (stack.empty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
        sc.close();
    }
}
