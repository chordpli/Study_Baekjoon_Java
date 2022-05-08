package study01.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Number_10214 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스
        int t = Integer.parseInt(br.readLine());

        // 각 테스트 케이스는 9줄에 걸쳐서 입력된다.
        // 테스트 케이스 만큼 반복
        for (int i = 0; i < t; i++) {

            int yonseiScore = 0;
            int koreaScore = 0;

            // 테스트 케이스는 9줄에 걸쳐서 입력
            for (int j = 0; j < 9; j++) {
                String Score = br.readLine();
                StringTokenizer st = new StringTokenizer(Score);
                yonseiScore += Integer.parseInt(st.nextToken());
                koreaScore += Integer.parseInt(st.nextToken());
            }

            if (yonseiScore > koreaScore) {
                bw.write("Yonsei" + "\n");
                //System.out.println("Yonsei");
            } else if (koreaScore > yonseiScore) {
                bw.write("Korea" + "\n");
                //System.out.println("Korea");
            } else {
                bw.write("Draw" + "\n");
                //System.out.println("Draw");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
