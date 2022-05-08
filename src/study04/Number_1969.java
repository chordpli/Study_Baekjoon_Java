package study04;

import java.util.Scanner;

public class Number_1969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DNA수
        int number = Integer.parseInt(sc.next());
        //입력된 DNA 길이
        int len = Integer.parseInt(sc.next());

        sc.nextLine();

        String[] DNA = new String[number];

        for (int i = 0; i < number; i++) {
            DNA[i] = sc.nextLine();
        }
        int sumHD = 0;
        StringBuilder sd = new StringBuilder();

        for (int i = 0; i < len; i++) {
            int T = 0, A = 0, G = 0, C = 0, max = 0;
            int HD = 0;

            for (int j = 0; j < number; j++) {
                if (DNA[j].charAt(i) == 'A') {
                    A++;
                } else if (DNA[j].charAt(i) == 'T') {
                    T++;
                } else if (DNA[j].charAt(i) == 'G') {
                    G++;
                } else if (DNA[j].charAt(i) == 'C') {
                    C++;
                }
            }
            if (A >= T && A >= G && A >= C) {
                max = A;
                sd.append("A");
            } else if (C >= A && C >= G && C >= T) {
                max = C;
                sd.append("C");
            } else if (G >= A && G >= C && G >= T) {
                max = G;
                sd.append("G");
            } else {
                max = T;
                sd.append("T");
            }
            HD = number - max;
            sumHD += HD;
        }

        System.out.println(sd);
        System.out.println(sumHD);
        sc.close();
    }
}
