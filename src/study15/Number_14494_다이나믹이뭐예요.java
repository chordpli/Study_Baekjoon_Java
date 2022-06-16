package study15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_14494_다이나믹이뭐예요 {

    static long dp[][];

    public static long dp(int num, int num2) {
        if (num == 0 || num2 == 0) return 0;
        if (num == 1 && num2 == 1) return 1;
        if (dp[num][num2] != -1) return dp[num][num2];

        long result = (dp(num, num2 - 1) + dp(num - 1, num2) + dp(num - 1, num2 - 1)) % 1000000007;
        dp[num][num2] = result;
        return result;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        dp = new long[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(dp(n, m) % 1000000007);
    }
}
