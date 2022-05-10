//준규가 사는 나라는 우리가 사용하는 연도와 다른 방식을 이용한다.
// 준규가 사는 나라에서는 수 3개를 이용해서 연도를 나타낸다.
// 각각의 수는 지구, 태양, 그리고 달을 나타낸다.
//
//지구를 나타내는 수를 E, 태양을 나타내는 수를 S, 달을 나타내는 수를 M이라고 했을 때,
// 이 세 수는 서로 다른 범위를 가진다. (1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
//
//우리가 알고있는 1년은 준규가 살고있는 나라에서는 1 1 1로 나타낼 수 있다.
// 1년이 지날 때마다, 세 수는 모두 1씩 증가한다.
// 만약, 어떤 수가 범위를 넘어가는 경우에는 1이 된다.
//
//예를 들어, 15년은 15 15 15로 나타낼 수 있다.
// 하지만, 1년이 지나서 16년이 되면 16 16 16이 아니라 1 16 16이 된다.
// 이유는 1 ≤ E ≤ 15 라서 범위를 넘어가기 때문이다.
//
//E, S, M이 주어졌고, 1년이 준규가 사는 나라에서 1 1 1일때, 준
// 규가 사는 나라에서 E S M이 우리가 알고 있는 연도로 몇 년인지 구하는 프로그램을 작성하시오.

//첫째 줄에 세 수 E, S, M이 주어진다. 문제에 나와있는 범위를 지키는 입력만 주어진다.

//첫째 줄에 E S M으로 표시되는 가장 빠른 연도를 출력한다.
// 1 1 1은 항상 1이기 때문에, 정답이 음수가 나오는 경우는 없다.

package study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_1476 {
    public static void main(String[] args) throws IOException {

        // 첫째 줄에 세 수 E, S, M이 공백을 사이로 두고 주어지기 때문에
        // BufferedReader와 StringTokenizer를 사용하여 입력을 받았다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);


        // nextToken을 사용하여 공백을 기준으로 나눈 문자열들을 각 변수에
        // Int 형태로 변환하여 대입한다.
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 비교할 변수를 생성한다.
        int earth = 0, sun = 0, moon = 0, year = 0;

        while (true) {

            //  해당 변수의 값들이 입력된 변수의 값과 일치하면 반복문을 종료한다.
            if (earth == E && sun == S && moon == M) {
                break;
            }

            // 연도를 증가한다.
            year++;

            // 지구연도 증가
            earth++;
            
            // 증가하였을 때 지구의 연도가 16이 된다면 1로 변환.
            if (earth == 16) {
                earth = 1;
            }
            
            // 태양 연도 증가
            sun++;
            // 증가하였을 때 태양의 연도가 29가 된다면 1로 변환.
            if (sun == 29) {
                sun = 1;
            }
            
            // 달 연도 증사
            moon++;
            // 증가하였을 때 달의 연도가 20이 된다면 1로 변환
            if (moon == 20) {
                moon = 1;
            }
        }

        System.out.println(year);
        br.close();
    }
}