package study06;

import java.util.Scanner;

public class Number_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 지민이가 갖고 싶은 막대기의 cm
        int x = sc.nextInt();

        // 현재까지 만들어진 막대기의 길이
        int result = 0;
        // 몇개의 막대기를 붙여야 하는가?
        int count = 0;

        while (true) {
            // 지민이가 가지고 있는 막대기
            int stick = 64;

            if (result == x) {
                System.out.println(count);
                break;
            } else if (stick == x) { // 막대기의 길이와 원하는 길이가 일치하는 경우
                System.out.println(1);
                break;
            }

            while (true) {
                // 현재까지 만들어진 길이 + 막대기의 길이가 x보다 크다면
                // 막대기의 길이를 반으로 자른다.
                // 반으로 자른 막대 + 현재까지 만들어진 길이의 합이 x보다 또 크다면
                // 또 막대기의 길이를 반으로 자른다
                // 반복...
                if (result + stick > x) {
                    stick = stick / 2;
                } else {
                    break;
                }
            }
            // 자르고 잘라진 막대기의 길이를 result에 더하여 대입한다.
            result += stick;
            count++;
        }
        sc.close();
    }
}

// 2진법을 계산하는 거라서
// 2진법으로 변환 후 1의 갯수를 카운트해도 문제는 풀린다.