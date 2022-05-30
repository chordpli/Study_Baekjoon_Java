package study10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_16395 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N개의 행
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 파스칼의 삼각형 입력
        int[][] T = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1 ; j <= i; j++) {
                if(j==1 || j==i ){
                    T[i][j] =1 ;
                }else{
                    T[i][j] = T[i-1][j-1] + T[i-1][j];
                }
            }
        }
        System.out.println(T[N][K]);
    }
}

// 조합
