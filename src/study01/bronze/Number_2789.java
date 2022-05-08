package study01.bronze;

import java.io.*;

public class Number_2789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // CAMBRIDGE에 포함된 알파벳은 모두 지우기로

        String[] censorship = {"C", "A", "M", "B", "R", "I", "D", "G", "E"};

        String input = br.readLine().toUpperCase().trim();
        String[] censor = input.split("");

        String result = "";

        for (int i = 0; i < censor.length; i++) {
            for (int j = 0; j < censorship.length; j++) {
                if (censor[i].equals(censorship[j])) {
                    censor[i] = "";
                }
            }
        }
        for (int i = 0; i < censor.length; i++) {
            result += censor[i];
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
        //System.out.println(result);
    }
}
