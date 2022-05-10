//OX 문제는 맞거나 틀린 두 경우의 답을 가지는 문제를 말한다.
// 여러 개의 OX 문제로 만들어진 시험에서 연속적으로 답을 맞히는 경우에는 가산점을 주기 위해서
// 다음과 같이 점수 계산을 하기로 하였다. 1번 문제가 맞는 경우에는 1점으로 계산한다.
// 앞의 문제에 대해서는 답을 틀리다가 답이 맞는 처음 문제는 1점으로 계산한다.
// 또한, 연속으로 문제의 답이 맞는 경우에서
// 두 번째 문제는 2점, 세 번째 문제는 3점, ..., K번째 문제는 K점으로 계산한다.
// 틀린 문제는 0점으로 계산한다.
//
//예를 들어, 아래와 같이 10 개의 OX 문제에서 답이 맞은 문제의 경우에는 1로 표시하고,
// 틀린 경우에는 0으로 표시하였을 때, 점수 계산은 아래 표와 같이 계산되어,
// 총 점수는 1+1+2+3+1+2=10 점이다.

//첫째 줄에 문제의 개수 N (1 ≤ N ≤ 100)이 주어진다.
// 둘째 줄에는 N개 문제의 채점 결과를 나타내는 0 혹은 1이 빈 칸을 사이에 두고 주어진다.
// 0은 문제의 답이 틀린 경우이고, 1은 문제의 답이 맞는 경우이다.

//첫째 줄에 입력에서 주어진 채점 결과에 대하여 가산점을 고려한 총 점수를 출력한다.

package study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2506_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문제의 갯수. -> 문제의 갯수를 받을 필요가 있는가?
        int question = Integer.parseInt(br.readLine());
        // N개 문제의 채점 결과를 배열에 입력.
        String[] ans = br.readLine().split(" ");

        // 점수를 누적할 변수 sum
        int sum = 0;

        // 누적 점수를 체크하기 위한 변수 count
        int count = 1;

        // 문제 채점 결과 길이 만큼 반복하면서
        for (int i = 0; i < ans.length - 1; i++) {
            for (int j = i + 1; j <= i + 1; j++) {
                // 채점 결과가 1이면서 다음 채점 결과도 1일 때,
                // count를 sum에 더하고 count의 값을 증가시킨다.
                if (ans[i].equals("1") && ans[i].equals(ans[j])) {
                    sum += count;
                    count++;
                // 현재 채점 결과가 1이나 다음 채점 결과가 0일 때,
                // sum에 기존 count의 값을 더하고 count의 값을 1로 변환한다.
                } else if (ans[i].equals("1") && !ans[i].equals(ans[j])) {
                    sum += count;
                    count = 1;
                }
            }
        }

        // 마지막 자리의 채점 결과를 위한 코드
        // 맨 마지막 채점 결과와 그 이전의 채점 결과가 모두 0일 때 count의 값을 0으로 한다.
        // 이거 없어도 될 것 같은데...
        if (ans[ans.length - 1].equals("0") && ans[ans.length - 2].equals("0")) {
            count = 0;
        // 맨 마지막 채점 결과가 1이면서 count의 값이 1보다 클 때 sum에 count를 더한다.
        } else if (ans[ans.length - 1].equals("1") && count >= 1) {
            sum += count;
        }

        System.out.println(sum);
        br.close();
    }
}
//