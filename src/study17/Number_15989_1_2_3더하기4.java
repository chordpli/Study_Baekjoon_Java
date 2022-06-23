package study17;

import java.util.Scanner;

public class Number_15989_1_2_3더하기4 {
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dp = new int[10001][4];
        dp[1][1] = 1;
        dp[2][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        int T = sc.nextInt();

        for(int i = 4; i <= 10000 ; i ++){
            dp[i][1] = dp[i-1][1];
            dp[i][2] = dp[i-2][1] + dp[i-2][2];
            dp[i][3] = dp[i-3][1] + dp[i-3][2] + dp[i-3][3];
        }

        for(int i = 0; i < T; i++ ){
            int N = sc.nextInt();
            System.out.println(dp[N][1] + dp[N][2] + dp[N][3]);
        }
    }
}