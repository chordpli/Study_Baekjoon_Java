package study14;

import java.io.*;
import java.util.StringTokenizer;

public class Number_16173_점프왕쩰리2 {
    static int[][] map;
    static boolean[][] visited = new boolean[3][3];
    static int N;
    static String result = "Hing";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[j][i] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();
        bw.write(search(0, 0));
        bw.flush();
        bw.close();
    }

    public static String search(int x, int y) {
        visited[x][y] = true;

        if (map[x][y] == -1) {
            return result = "HaruHaru";
        } else {
            if (x + map[x][y] < N && !visited[x + map[x][y]][y]) {
                search(x + map[x][y], y);
            }
            if (y + map[x][y] < N && !visited[x][y + map[x][y]]) {
                search(x, y + map[x][y]);
            }
        }
        return result;
    }
}