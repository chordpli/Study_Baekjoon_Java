package study16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_2178_미로탐색 {
    static boolean[][] visited = new boolean[102][102];
    static int n, m;
    static int[][] miro;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        miro = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            for (int j = 1; j <= m; j++) {
                miro[i][j] = (input.charAt(j - 1) - '0');
            }
        }
        result = 10001;
        dfs(1, 1, 1);
        System.out.println(result);
    }

    public static void dfs(int x, int y, int count) {
        visited[x][y] = true;

        if (x == n && y == m) {
            if (count < result) {
                result = count;
                return;
            }
        }

        if(count > result) return ;

        // 하
        if (x+1 <= n && miro[x + 1][y] == 1 && !visited[x + 1][y]) {
            dfs(x + 1, y, count + 1);
            visited[x+1][y] = false;
        }

        // 우
        if (y + 1 <= m  && miro[x][y + 1] == 1 && !visited[x][y + 1]) {
            dfs(x, y + 1, count + 1);
            visited[x][y+1] = false;
        }

        // 상
        if (x-1 >0 && miro[x-1][y] == 1 && !visited[x-1][y]) {
            dfs(x-1, y, count + 1);
            visited[x-1][y] = false;
        }

        // 좌
        if (y-1 >0 && miro[x][y-1] == 1 && !visited[x][y-1]) {
            dfs(x, y-1, count + 1);
            visited[x][y-1] = false;
        }
    }
}
