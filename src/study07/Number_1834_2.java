package study07;

import java.util.Scanner;

public class Number_1834_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt();
        long sum = 0;

        // 나머지와 몫이 모두 같은 자연수의 갯수는 N-1개이므로
        // 반복문의 범위는 N-1이 된다.
        for(long i = 1; i <= N-1; i++){
            // 나머지와 몫이 모두 같은 자연수를 만들어 가는 방법
            // (N * i(몫)) + i(나머지) = 나머지와 몫이 모두 같은 자연수.
            sum += (N*i) + i;
        }

        System.out.println(sum);
        sc.close();
    }
}
