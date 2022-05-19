package study07;

import java.util.Scanner;

public class Number_14912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(sc.next());
        String num = sc.nextLine();

        char cNum = num.charAt(1);

        int count = 0;

        for(int i = 1; i <=n ; i++ ){
            sb.append(String.valueOf(i));
        }

        for(int i = 0; i <sb.length(); i++){
            if(cNum == sb.charAt(i)){
                count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}
