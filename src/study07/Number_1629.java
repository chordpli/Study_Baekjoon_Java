package study07;

import java.util.Scanner;

public class Number_1629 {

    public static void main(String[] args) {
        // 첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다.
        // A, B, C는 모두 2,147,483,647 이하의 자연수이다.
        Scanner sc = new Scanner(System.in);

        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        long C = sc.nextLong();

        System.out.println(power(A%C, B, C));
        sc.close();
    }

    private static long power(long a, long b, long c){
    // long a는 자연수 A
    // long b는 곱할 횟수
    // long c는 a제곱 b의 나머지를 구할 수

        // b가 1일 때
        if(b==1) return a;

        // 재귀함수
        // b를 반으로 분할하여 다시 power 메서드를 진행시고 그 나머지를 구한다.
        long temp = power(a, b / 2, c) % c;

        // b가 짝수일 때
        if(b%2 == 0){
            return(temp * temp) % c;
        }else { // B가 홀수일 때
            return (((temp * temp) % c) * a) % c;
        }
    }
}

