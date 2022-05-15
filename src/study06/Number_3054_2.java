package study06;

import java.util.Scanner;

public class Number_3054_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int index = input.length();
        char[] alpha = new char[index];

        for (int i = 0; i < index; i++) {
            alpha[i] = input.charAt(i); // input으로 들어온 문자열을 alpha 하나의 배열에 한 문자씩 저장
        }

        for (int i = 0; i < 5; i++) { // 5줄 짜리 출력문을 만들어야 하므로 i < 5를 지정한다.
            for (int j = 1; j < index + 1; j++) {
                if (i == 0 || i == 4) { // 첫번째 줄과 5번째 줄에 출력할 내용
                    if (j % 3 != 0) {
                        System.out.print("..#.");
                    } else {
                        System.out.print("..*.");
                    }
                } else if (i == 1 || i == 3) { // 두번째 줄과 3번째 줄에 출력할 내용
                    if (j % 3 != 0) {
                        System.out.print(".#.#");
                    } else {
                        System.out.print(".*.*");
                    }
                } else { // 세번째 줄에 출력할 때요
                    if (j % 3 == 0 || (j != 1 && j % 3 == 1)) {
                        System.out.print("*." + alpha[j - 1] + ".");
                    } else {
                        System.out.print("#." + alpha[j - 1] + ".");
                    }
                }
            }
            if (i != 2) { // 3번째 줄을 제외하고는 모두 우측에 점을 붙여 끝을 낸다.
                System.out.println(".");
            } else {
                if (index % 3 == 0) { // 3번째 줄이면서 3으로 나눠 떨어진다면
                    System.out.println("*"); // 웬디 프레임
                } else {
                    System.out.println("#"); // 3으로 나눠 떨어지지 않는다면 피터팬 프레임이다.
                }
            }
        }
        sc.close();
    }
}