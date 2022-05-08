// 참가한 동아리들은 3인 1팀으로 팀을 구성해 각자 라이브로 문제를 풀고 심사를 받는다.
package study01.bronze;

import java.io.*;

public class Number_23348 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        /////////// 기술 점수 ///////////
        String levelStr = br.readLine().trim();
        String[] levelStrArr = new String[3];
        levelStrArr = levelStr.split(" ");

        int[] levelIntArr = new int[3];

        for(int i = 0; i < levelStrArr.length; i++){
            levelIntArr[i] = Integer.parseInt(levelStrArr[i]);
        }

        /////////// 동아리 수 ///////////

        int club = Integer.parseInt(br.readLine());
        int[] sum = new int[club];
        /////////// 기술 사용 정보 ///////////

        for(int i = 0 ; i < club; i++){
            String techNum;
            String[] techTimeArr = new String[3];
            int[] techIntArr = new int[3];
            for(int j = 0; j < 3; j++){
                techNum = br.readLine().trim();
                techTimeArr = techNum.split(" ");

                for(int k = 0; k < 3; k++){
                    techIntArr[k] = Integer.parseInt(techTimeArr[k]);
                }

                for(int k = 0; k < 3; k++){
                    sum[i] += techIntArr[k] * levelIntArr[k];
                }
            }
        }
        /////////// 가장 높은 점수를 받은 동아리의 점수 출력 ///////////
        int max = 0;

        for(int i = 0; i < sum.length; i++){
            if(sum[i] > max){
                max = sum[i];
            }else{
                max = max;
            }
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();
        //System.out.println(max);
    }
}