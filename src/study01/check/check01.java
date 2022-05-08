package study01.check;

import java.util.Scanner;
public class check01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] remove = new String[] {"C","A","M","B","R","I","D","G","E"};
        String str = sc.next();
        String[] strArr = str.split("");
        for(int j=0; j<strArr.length; j++) {
            for(int i=0; i<remove.length; i++) {
                strArr[j] = strArr[j].replace(remove[i],"");
            }
            System.out.print(strArr[j]);
        }
        sc.close();
    }
}