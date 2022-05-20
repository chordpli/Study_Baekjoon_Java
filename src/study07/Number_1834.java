package study07;

import java.util.Scanner;

public class Number_1834 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long sum = 0;

        //나눌 숫자
        long i = 0;
        // 몫
        long portion = 0;
        // 나머지
        long rest = 0;

        while (true) {

            if (portion > n) {
                break;
            } else {
                portion = i / n;
                rest = i % n;

                if (portion == rest) {
                    sum += i;
                }
            }

            i++;
        }

        System.out.println(sum);
        sc.close();
    }
}
// 나머지는 N보다 작다. 즉 몫과 나머지는 N보다 작아야한다.