package study12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 	메모리 11512	시간80ms

public class Number_11721_열개씩끊어출력하기_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        List<String> strList = new ArrayList<String>();

        for (int i = 0; i < input.length(); i++) {
            strList.add(String.valueOf(input.charAt(i)));
        }

        while (true) {
            for (int i = 0; i < 10; i++) {
                if (strList.isEmpty()) {
                    break;
                } else {
                    System.out.print(strList.remove(0));
                }
            }
            if (strList.isEmpty()){
                break;
            }else{
                System.out.println();
            }
        }
    }
}
