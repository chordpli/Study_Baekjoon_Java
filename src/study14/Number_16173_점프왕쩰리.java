package study14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_16173_점프왕쩰리 {
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for(int i = 0; i < N; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; i <N; j++){
                map[i][N] = Integer.parseInt(st.nextToken());
            }
        }

    }

    public int search(int num){

        if(map[])

    }
}
