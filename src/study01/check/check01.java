package study01.check;

import java.util.Scanner;
public class check01 {
    public static void main(String[] args) {
        String[] arr = new String[2];
        arr[0] = "abc";
        String a = "abc";
        String b = "bcd";

        System.out.println(arr[0].charAt(1) == b.charAt(0));
    }
}