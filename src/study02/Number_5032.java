//준민이는 탄산 음료를 좋아한다. 탄산 음료를 사느라 돈을 다 써버렸기 때문에, 이제 준민이는 가진 돈이 없어 탄산 음료를 사먹을 수 없다.
//준민이는 항상 법을 지키며 사는 사람이기 때문에, 아무리 탄산 음료가 먹고 싶어도 훔치지 않는다. 따라서, 법적으로 문제가 없는 방법으로 탄산 음료를 구매할 것이다.
//마침 빈 병을 특정 개수만큼 가져가면, 새 병으로 바꾸어주는 이벤트가 진행중이다. 준민이는 길에서 빈 병을 열심히 찾은 뒤, 탄산 음료를 먹으려고 한다.
//준민이가 현재 가지고 있는 빈 병의 수와 길에서 발견한 빈 병의 수, 새 병으로 바꾸는데 필요한 빈 병의 수가 주어졌을 때, 준민이가 탄산 음료를 몇 개 먹을 수 있는지 구하는 프로그램을 작성하시오.

//첫째 줄에 준민이가 가지고 있는 빈 병의 수 e, 그날 발견한 빈 병의 수 f, 새 병으로 바꾸는데 필요한 빈 병의 개수 c가 주어진다. (e < 1000, f < 1000, 1 < c < 2000) e, f, c는 모두 음이 아닌 정수이다.

package study02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_5032 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);

        int e = Integer.parseInt(st.nextToken()); // 가지고 있는 빈병
        int f = Integer.parseInt(st.nextToken()); // 그 날 발견한 빈병
        int c = Integer.parseInt(st.nextToken()); // 새 병으로 바꾸는 빈 병의 갯수

        int change = (e + f) / c;                     // 새 병으로 받은 탄산의 갯수
        int remain = (e + f) % c + change;            // 반환하고 남은 빈 병의 갯수
        int result = change;                      // 새 병으로 받은 누적 갯수

        while (true) {
            if (remain >= c) {                      // 반환하고 (또 먹고 남은) 병의 갯수가 새 병으로 바꿀 수 있는 조건보다 큰지 확인.
                change = remain / c;                // 새롭게 반환 받은 탄산의 갯수
                remain = (remain % c) + change;     // 갯수가 모자라 반환받지 못한 빈 병과 새롭게 받아 먹고 남은 탄산 빈병의 갯수를 저장
                result += change;                 // 새롭게 반환 받은 탄산의 갯수를 누적.
            } else {
                break;
            }
        }
        System.out.println(result);
    }
}

// 교환 받고 끝나는 것이 아니라, 교환 받은 병을 먹고 다시 새 음료를 교환받아 먹는
// 준민이의 과한 탄산 중독을 생각해야 풀 수 있는 문제다....
// 이정도면 환자인데..