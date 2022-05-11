package study05;

import java.util.Scanner;

public class Number_1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 이름의 갯수
        int times = sc.nextInt();

        String[] files = new String[times];
        sc.nextLine(); // 개행문자 오류 방지

        for (int i = 0; i < files.length; i++) {
            files[i] = sc.nextLine();
        }

        for (int i = 1; i < files.length; i++) {
            for (int j = 0; j < files[0].length(); j++) {
                if (files[0].charAt(j) != files[i].charAt(j)) {
                    files[0] = files[0].substring(0, j) + '?' + files[0].substring(j + 1);
                }
            }
        }

        System.out.println(files[0]);
        sc.close();
    }
}
