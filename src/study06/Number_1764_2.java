package study06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_1764_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);

        String[] noListen = new String[Integer.parseInt(st.nextToken())];
        String[] noSee = new String[Integer.parseInt(st.nextToken())];

        int len = noListen.length + noSee.length;

        for (int i = 0; i < noListen.length; i++) {
            noListen[i] = br.readLine();
        }

        for (int i = 0; i < noSee.length; i++) {
            noSee[i] = br.readLine();
        }

        for (int i = 0; i < noSee.length; i++) {
            for (int j = 0; j < noListen.length; j++) {
                if (noSee[i].equals(noListen[j])) {
                    System.out.println(noSee[i]);
                }
            }
        }

        br.close();
    }
}


// 시간 초과