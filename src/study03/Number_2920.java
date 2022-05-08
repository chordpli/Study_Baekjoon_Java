package study03;

import java.util.Scanner;

public class Number_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] melody = new int[8];      // 8개의 음을 저장할 int 배열 생성
        int check = 0;

        for (int i = 0; i < melody.length; i++) { // 8개음을 입력받는다.
            melody[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < melody.length - 1; i++) {
            if (melody[i] + 1 == melody[i + 1]) { // melody[i] + 1과 그 다음 배열인
                check++;                          // melody[i+1]이 동일하면 체크한다.
            } else if (melody[i] - 1 == melody[i + 1]) {
                check--;                          // melody[i] - 1과 그 다음 배열인
            } else {                              // melody[i-1]이 동일하면 체크한다.

            }
        }

        if (check == 7) { //
            System.out.println("ascending");
        } else if (check == -7) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        sc.close();
    }
}
