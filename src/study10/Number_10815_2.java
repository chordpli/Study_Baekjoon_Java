package study10;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number_10815_2 {

    static int N, M;
    static int[] sang;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 상근이가 가지고 있는 숫자의 갯수
        N = Integer.parseInt(br.readLine());
        // 상근이가 가지고 있는 숫자 카드 저장
        sang = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 상근이가 가지고 있는 숫자 카드
        for (int i = 0; i < N; i++) {
            sang[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sang);

        // 상근이가 가지고 있는지 확인할 숫자의 갯수
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            if(binarySearch(num)){
                bw.write("1 ");
            }else{
                bw.write("0 ");
            }

        }
        // 확인할 숫자 카드 저장
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean binarySearch(int num) {
        int left = 0;
        int right = N - 1;

        while (left <= right) {
            int midIndex = (left + right) / 2;
            int mid = sang[midIndex];

            if (num < mid) {
                right = midIndex - 1;
            } else if (num > mid) {
                left = midIndex + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}