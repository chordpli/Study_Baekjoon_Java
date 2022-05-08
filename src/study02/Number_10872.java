// 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
// 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
package study02;

import java.util.Scanner;

public class Number_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 1;

        for (int i = n; i > 0; i--) {
            result *= i;
        }

        System.out.println(result);
        sc.close();
    }
}

/* 재귀를 활용한 풀이법
public class Number_10872 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(factorial(sc.nextInt()));
    }

    public static int factorial(int num){
        if(num == 0){
            return 1;
        }else{
            return num * factorial(num-1);
        }
    }
}
 */