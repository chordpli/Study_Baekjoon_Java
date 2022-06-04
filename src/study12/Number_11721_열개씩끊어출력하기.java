package study12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_11721_열개씩끊어출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();


        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
