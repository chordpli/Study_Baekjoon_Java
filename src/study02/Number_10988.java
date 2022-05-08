package study02;

import java.util.Scanner;

public class Number_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();
        String[] sArray;
        sArray = str.split("");

        int check = 0;
        int len = sArray.length;

        for(int i = 0; i < len/2 ; i++ ){
            if(!sArray[i].equals(sArray[len-i-1])){
                check++;
            }
        }

        if (check == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
