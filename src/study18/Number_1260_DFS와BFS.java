package study18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Number_1260_DFS와BFS {

    // 정점의 갯수
    static int N;
    // 간선의 갯수
    static int M;
    // 정점의 시작 번호
    static int V;

    // 노드 연결
    static int[][] link;
    // 방문
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        link = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            link[x][y] = 1;
            link[y][x] = 1;
        }

        dfs(V);
        visited = new boolean[N+1];
        System.out.println();
        bfs(V);
    }
    public static void dfs(int V){
        visited[V] = true;
        System.out.print(V + " ");

        for(int i = 1; i<= N; i++){
            if(link[V][i]==1 && !visited[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int V){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(V);
        visited[V] = true;

        while(!queue.isEmpty()){
            int temp = queue.poll();
            System.out.print(temp + " ");

            for(int i = 1; i <= N; i++){
                if(link[temp][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
