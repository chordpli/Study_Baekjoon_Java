package study10;

import java.io.*;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Number_5107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, String> manitto = new HashMap<String, String>();

        // 테스트 케이스 사람 수
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i <N ; i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            manitto.put(st.nextToken(), st.nextToken());
        }







    }
}
