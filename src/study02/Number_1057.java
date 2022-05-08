package study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        // 참가자의 수
        int n = Integer.parseInt(st.nextToken());

        // 김지민 번호
        int a = Integer.parseInt(st.nextToken());
        // 임한수 번호
        int b = Integer.parseInt(st.nextToken());
        
        // 대결하는 라운드 체크
        int count = 0;

        while(a!=b){

            a = a/2 + a%2;
            b = b/2 + b%2;
            count++;
        }
        System.out.println(count);

        br.close();

    }
}

// 규칙을 찾는 것이 중요한 문제.
// 다음 라운드로 넘어가면서 번호는 초기화 되기 때문에 이기는 것은 중요하지 않음.
// 두 선수의 번호가 같다 == 두 선수가 만났다. 이므로 while문을 종료시킨다.



