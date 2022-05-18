package study07;

import java.util.Scanner;

public class Number_1834_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt();
        long sum = 0;

        for(long i = 1; i <= N-1; i++){
            sum += (N*i) + i;
        }

        System.out.println(sum);
        sc.close();
    }
}
