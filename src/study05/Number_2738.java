package study05;

import java.util.Scanner;

public class Number_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = sc.nextInt();

        // 2차원 배열 생성
        int[][] aArr = new int[n][m];
        int[][] bArr = new int[n][m];

        // 행렬 A 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                aArr[i][j] = Integer.parseInt(sc.next());
            }
        }

        // 행렬 B 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bArr[i][j] = Integer.parseInt(sc.next());
            }
        }

        // 배열의 합
        int[][] sumArr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumArr[i][j] = aArr[i][j] + bArr[i][j];
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sumArr[i][j] + " ");
            }
            // 마지막 줄바꿈 방지
            if(i != n -1){
                System.out.println();
            }

        }
    }
}
