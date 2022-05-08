package study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int earth = 0, sun = 0, moon = 0, year = 0;

        while (true) {

            if (earth == E && sun == S && moon == M) {
                break;
            }

            year++;

            earth++;
            if (earth == 16) {
                earth = 1;
            }

            sun++;
            if (sun == 29) {
                sun = 1;
            }

            moon++;
            if (moon == 20) {
                moon = 1;
            }
        }

        System.out.println(year);
        br.close();
    }
}