package study12;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for(int i = 1; i <= c ; i++){
            System.out.print("*");
            if(i%5==0){
                System.out.println();
            }
        }
    }
}
