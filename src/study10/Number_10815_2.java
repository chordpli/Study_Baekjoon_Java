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

        // 상근이가 가지고 있는 숫자의 갯수
        int right = N - 1;

        while (left <= right) {
            // 중간값의 인덱스를 찾는다.
            int midIndex = (left + right) / 2;
            // 인덱스를 통해 중간값을 찾는다.
            int mid = sang[midIndex];

            // 입력한 숫자가 중간값보다 작을 경우 해당 메소드 실행
            if (num < mid) {
                right = midIndex - 1;
            } else if (num > mid) {
                // 입력한 숫자가 중간값보다 클 경우 해당 메소드 실쟁
                left = midIndex + 1;
            } else {// 입력한 숫자와 중간값이 동일할 경우 해당 값 리턴
                return true;
            }
        }
        return false;
    }
}

//해시셋, 해시맵 이런걸로도 가능.