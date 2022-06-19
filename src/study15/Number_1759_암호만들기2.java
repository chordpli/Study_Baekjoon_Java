package study15;

import java.util.Arrays;
import java.util.Scanner;

public class Number_1759_암호만들기2 {
    static int l, c;
    static char cArr[];
    static boolean visited[] =  new boolean[16];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        l = sc.nextInt();
        c = sc.nextInt();
        cArr = new char[c];
        for (int i = 0; i < c; i++) {
            cArr[i] = sc.next().charAt(0);
        }
        Arrays.sort(cArr);

        combination(0, 0);
    }

    static void combination(int start, int cnt) {
        // count가 원하는 비밀번호 길이인지
        if (cnt == l) {
            // 모음 체크
            int v = 0;
            // 자음 체크
            int cc = 0;
            StringBuilder sb = new StringBuilder();
            // 0부터 입력된 문자들의 길이까지(C) 반복 
            for (int i = 0; i < c; i++) {
                if (visited[i]) {
                    sb.append(cArr[i]);

                    if (cArr[i] == 'a' || cArr[i] == 'e' || cArr[i] == 'i' || cArr[i] == 'o' || cArr[i] == 'u') {
                        v++;
                    } else {
                        cc++;
                    }
                }
            }
            if (v >= 1 && cc >= 2) System.out.println(sb);
        }

        //백트래킹
        for (int i = start; i < c; i++) {
            visited[i] = true;
            combination(i + 1, cnt + 1);
            visited[i] = false;
        }
    }
}