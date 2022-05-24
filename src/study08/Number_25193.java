/*
곰곰이는 치킨을 좋아한다. 그러다 보니 매 끼니에 치킨을 먹고 있다.
당신은 곰곰이의 트레이너로서 곰곰이의 식단을 관리해주기로 했다.

곰곰이가 $N$일간 먹어야 할 음식들의 리스트가 주어졌을 때,
리스트의 순서를 원하는 대로 조정하여 곰곰이가 연속으로 치킨을 먹는 날의 최댓값을 가장 작게 만들려고 한다.

곰곰이의 건강을 위해 위와 같은 프로그램을 작성해 보자.
 */
package study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_25193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 식단을 정할 일수
        int N = Integer.parseInt(br.readLine());

        // 길이 N의 문자열 S
        String S = br.readLine().toUpperCase();
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'C')
                count++;
        }

        int result = count / ((N - count) + 1);

        if (count % (N - count + 1) != 0) {
            result += 1;
        }

        System.out.println(result);
        br.close();
    }
}
