package study03;

import java.util.Scanner;

public class Number_1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int len = input.length();
        StringBuilder sb = new StringBuilder();

        for(int i =0 ; i < len ; i++){
            if(input.charAt(i) - '0' == 1){
                sb.append("001");
            }else if(input.charAt(i) - '0' == 2){
                sb.append("010");
            }else if(input.charAt(i) - '0' == 3){
                sb.append("011");
            }else if(input.charAt(i) - '0' == 4){
                sb.append("100");
            }else if(input.charAt(i) - '0' == 5){
                sb.append("101");
            }else if(input.charAt(i) - '0' == 6){
                sb.append("110");
            }else if(input.charAt(i) - '0' == 7){
                sb.append("111");
            }else if(input.charAt(i) - '0' == 0){
                sb.append("000");
            }
        }
        String result = String.valueOf(sb);
        result = result.replaceFirst("^0+(?!$)", "");
        System.out.print(result);
    }
}


// 2진법 3자리.

//    Scanner sc = new Scanner(System.in);
//    String oct = sc.next();
//
//    int sum = 0;
//    int len = oct.length(); // 입력 받은 8진수의 길이.
//
//    StringBuilder sb = new StringBuilder(); // 2진수의 값을 계속 추가하기 위한 값.
//
//        for (int i = 0; i < oct.length(); i++) {
//        String a = Integer.toBinaryString(oct.charAt(i) - '0');
//        // String a에 2진법 정수로 변환한다.
//        if (a.length() == 2 && i != 0) a = "0" + a;
//        else if (a.length() == 1 && i != 0) a = "00" + a;
//
//        sb.append(a);
//        }
//
//
//        System.out.println(sb);