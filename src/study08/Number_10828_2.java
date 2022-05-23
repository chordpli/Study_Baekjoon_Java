package study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Number_10828_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>(); //  int형 스택 선언

        // 주어지는 명령의 수 N
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            if (input.contains("push")) {
                StringTokenizer st = new StringTokenizer(input);
                st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
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
        br.close();
    }
}
