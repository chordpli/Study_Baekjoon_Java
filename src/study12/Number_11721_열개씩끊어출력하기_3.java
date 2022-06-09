package study12;

import java.util.Scanner;

// 메모리 	12820	시간 108ms

public class Number_11721_열개씩끊어출력하기_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String c = sc.nextLine();

        for(int i = 1; i <= c.length() ; i++){
            System.out.print(c.charAt(i-1));
            if(i%10==0){
                System.out.println();
            }
        }
    }
}