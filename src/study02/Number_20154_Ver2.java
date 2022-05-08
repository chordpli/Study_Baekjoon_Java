package study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_20154_Ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 합계
        int sum = 0;

        // 알파벳 점수 배열
        int[] arr = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};

        for (int i = 0; i < str.length(); i++) {
            sum += arr[(str.charAt(i) - 'A')];
        }

        if(sum%2==0){
            System.out.println("You're the winner?");
        }else{
            System.out.println("I'm a winner!");
        }
    }
}


// charAt(i) - 'A'의 이유.
// 아스키코드에서 A는 65번에 해당된다.
// 만약 str 0번째 순서에 들어있는 문자가 A라면 str.charAt(0) = A이고 A-A를 하게 되므로 0이 된다.
// 그렇게 되면 arr 배열의 0번째 순서인 3이 sum에 들어가게 된다.
// 다음 1번째 순서에 들어가 있는 문자가 B라면 str.charat(1) = B이고 B는 아스키코드에서 66이다.
// B(66) - A(65)를 하면 1이 남으므로 arr 배열의 0번째 순서인 2가 sum에 들어가게 된다.
// Z(90)이 들어 있으면 Z(90) - A(65) = 25이므로 25번째 순서인 1이 sum에 들어가게된다.
// 만약 소문자로 입력을 받았다면 'A' 가 아닌, 'a'을 집어넣으면 될 것이다.