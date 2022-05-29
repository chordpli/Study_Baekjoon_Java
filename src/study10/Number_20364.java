package study10;

import java.io.*;
import java.util.StringTokenizer;

public class Number_20364 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstLine = br.readLine();
        StringTokenizer st = new StringTokenizer(firstLine);

        // 땅의 갯수
        int N = Integer.parseInt(st.nextToken());
        // boolean 의 기본 값은 boolean이므로 건들지 않음.
        boolean[] land = new boolean[N+1];

        // 오리수
        int Q = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= Q; i++) {
            int input = Integer.parseInt(br.readLine());
            int temp = input;
            int check = input;

            // input 값이 0이 될때까지 반복
            while(temp/2 != 0){
                // 땅을 소유하고 있다면 해당 땅 번호를 check변수에 대입.
                // 가장 숫자가 낮으면서 소유하고 있는 땅 번호를 찾아야하기 때문에 멈추지 않음.
                if(land[temp]){
                    check = temp;
                }
                // 해당 노드의 상위 노드로 이동.
                temp = temp/2;
            }
            
            // 입력값과 check 값이 동일하다면 원하는 땅에 도달하였음.

            // 2, 3이 중복 입력 되었을 경우를 대비하여 land[check] == false를 넣어줌.
            if(land[check] == false && check == input){
                land[input] = true;
                bw.write("0");
                bw.newLine();
            }else{
                // 입력값과 check값이 다르다면 처음 마주치는 점유된 땅의 번호를 출력
                bw.write(String.valueOf(check));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}