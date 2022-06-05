package study12;

/*
가위바위보는 가위, 바위, 보 중 하나를 선택한 A와 B, 두 플레이어를 위한 게임입니다.
종이를 선택한 플레이어는 바위를 선택한 플레이어를 이깁니다. 가위를 선택한 플레이어는 종이를 선택한 플레이어를 이깁니다. 바위를 선택한 플레이어는 가위를 선택한 플레이어를 이깁니다. 두 플레이어가 같은 것을 선택하였을 때는 이긴것도 패배한 것도 아닙니다.

토너먼트는 n명의 플레이어가 각각 다른 선수와 k번 가위바위보 게임을 하도록 구성되어 있습니다. - 총 k*n*(n-1)/2 게임을 진행합니다.
당신의 일은 w/(w+l) 정의된 각각의 플레이어 승률을 계산합니다, w는 게임을 이긴 횟수, l은 게임에 패배한 횟수입니다.

입력은 수십의 테스트 케이스로 구성되어 있습니다.
각 케이스는 위에서 정의한 값의 범위 1 <= n <= 100, 1 <= k<= 100를 포함하여 첫 번째 줄에 입력합니다.
각각의 게임은, 줄은 player 1 match1, palyer 2 match 2를 포함합니다.
1<= p1 <= n 그리고 1 <= p2 <=n은 별개의 정수들을 식별 두명의 플레이어
m1와 m2는 각각의 동작(바위 가위 보)입니다.
0을 포함한 줄은 마지막 테스트 케이스입니다.

player 1, plyaer 2는 각각 한 줄씩 플레이어 n을 통해 승률을 소수점 세 번째 자리에서 반올림하여 출력합니다.
만약 승률이 정의되지 않는다면 “-”를 출력합니다. 케이스간에는 빈칸을 출력합니다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Number_4289_RockPaperScissors {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            if(n == 0 ){
                break;
            }

            // 플레이어 수. 1부터 체크하기 위해 배열 +1
            int[] player = new int[n+1];
            double draw = 0;
            // 경기 횟수
            double k = Double.parseDouble(st.nextToken());
            for(int i = 0; i < k*n*(n-1)/2; i++ ){

                String input = br.readLine();
                st = new StringTokenizer(input);

                int a = Integer.parseInt(st.nextToken());
                String m1 = st.nextToken();
                int b = Integer.parseInt(st.nextToken());
                String m2 = st.nextToken();

                if(m1.equals("rock") && m2.equals("scissors") ||
                        m1.equals("scissors") && m2.equals("paper")||
                        m1.equals("paper") && m2.equals("rock")){
                    player[a] += 1;
                }else if(m2.equals("rock") && m1.equals("scissors") ||
                        m2.equals("scissors") && m1.equals("paper")||
                        m2.equals("paper") && m1.equals("rock")){
                    player[b] += 1;
                }else{
                    draw++;
                }

            }

            for(int i = 1; i<player.length;i++){
                System.out.println(Math.round((player[i]/(k-draw))*1000)/1000.0);
            }
        }
        br.close();
    }
}
