package study10;

import java.io.*;
import java.util.StringTokenizer;

public class Number_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 상근이가 가지고 있는 숫자의 갯수
        int N = Integer.parseInt(br.readLine());
        // 상근이가 가지고 있는 숫자 카드 저장
        int[] sang = new int[N];

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        // 상근이가 가지고 있는 숫자 카드
        for(int i = 0; i < N ; i++){
            sang[i] = Integer.parseInt(st.nextToken());
        }

        // 상근이가 가지고 있는지 확인할 숫자의 갯수
        int M = Integer.parseInt(br.readLine());
        // 확인할 숫자 카드 저장
        int[] check = new int[M];

        String input2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(input2);

        // 확인할 숫자 카드들
        for(int i = 0; i < M; i++){
            check[i] = Integer.parseInt(st2.nextToken());
        }

        int count = 0;
        // 확인 작업

        for(int i = 0; i < M; i ++){
            for(int j = 0; j < N; j++){
                if(check[i] == sang[j]){
                    count = 1;
                    bw.write(String.valueOf(count) + " ");
                    break;
                }
            }
            if(count == 0){
                bw.write(String.valueOf(count) + " ");
            }else {
                count = 0;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
