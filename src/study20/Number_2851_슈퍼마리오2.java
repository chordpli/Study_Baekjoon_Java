package study20;

import java.util.Scanner;

public class Number_2851_슈퍼마리오2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];
        for (int i = 0; i < 10; i++) {
            input[i] = sc.nextInt();
        }

        int sum = 0, i = 0, a = 0, b = 0;

        while (true) {
            sum += input[i];

            if (sum >= 100 || i == 9) {
                a = sum - input[i];
                b = sum;
                break;
            }
            i++;
        }
        int aa = Math.abs(a - 100), bb = Math.abs(b - 100);

        if (bb > aa ) {
            System.out.println(a);
        } else if (aa > bb) {
            System.out.println(b);
        } else {
            if (a > b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }
}
