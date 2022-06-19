package study16;

import java.util.Scanner;
import java.util.TreeSet;

public class Number_16922_로마숫자만들기 {

    static int[] number = {1, 5, 10, 50};
    static boolean[] visited = new boolean[21];
    static TreeSet<Integer> result = new TreeSet<>();

    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        make(0, 0);

        System.out.println(result.size());

    }

    public static void make(int a, int b) {

        if (a == n) {
            result.add(b);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int tmp = 0;
            tmp = b + number[i];
            make(a + 1, tmp);
        }
    }

}
