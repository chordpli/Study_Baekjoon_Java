package study04;

import java.util.Scanner;

public class Number_2947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] wood = new int[5];

        // 입력
        for (int i = 0; i < wood.length; i++) {
            wood[i] = Integer.parseInt(sc.next());
        }

        while (true) {
            int temp = 0;

            // 위치 바꾸기
            if (wood[0] > wood[1]) {
                temp = wood[0];
                wood[0] = wood[1];
                wood[1] = temp;

                for (int i = 0; i < wood.length; i++) {
                    System.out.print(wood[i] + " ");
                }

                System.out.println();
            }

            if (wood[1] > wood[2]) {
                temp = wood[1];
                wood[1] = wood[2];
                wood[2] = temp;

                for (int i = 0; i < wood.length; i++) {
                    System.out.print(wood[i] + " ");
                }
                System.out.println();
            }

            if (wood[2] > wood[3]) {
                temp = wood[2];
                wood[2] = wood[3];
                wood[3] = temp;

                for (int i = 0; i < wood.length; i++) {
                    System.out.print(wood[i] + " ");
                }
                System.out.println();
            }


            if (wood[3] > wood[4]) {
                temp = wood[3];
                wood[3] = wood[4];
                wood[4] = temp;

                for (int i = 0; i < wood.length; i++) {
                    System.out.print(wood[i] + " ");
                }
                System.out.println();
            }

            // 탈출 조건

            if (wood[0] == 1 && wood[1] == 2 && wood[2] == 3
                    && wood[3] == 4 && wood[4] == 5) {
                break;
            }
        }

        sc.close();
    }
}
//