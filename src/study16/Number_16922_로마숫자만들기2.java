package study16;

import java.util.Scanner;

public class Number_16922_로마숫자만들기2 {

    static int[] number = {1, 5, 10, 50};
    static boolean[] visited = new boolean[10001];
    static int result = 0;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        dfs(0,0,0);

        System.out.println(result);

    }

    static void dfs(int depth, int start, int sum){
        if(depth == n){
            if(!visited[sum]){
                result++;
                visited[sum] = true;
            }
            return;
        }

        for(int i =start; i< 4; i++){
            dfs(depth+1, i, sum+number[i]);
        }
    }
}