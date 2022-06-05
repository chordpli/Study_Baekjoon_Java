package study12;

import java.util.Scanner;

public class Number_1357_뒤집힌덧셈 {
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.next());
        int y = sc.nextInt();

        System.out.println(Rev(Rev(x)+Rev(y)));
    }


    public static int Rev(int x) {
        String[] a = String.valueOf(x).split("");

        StringBuilder sb = new StringBuilder();

        for (int i = a.length-1; i >= 0; i--) {
            sb.append(a[i]);
        }
        int revX = Integer.parseInt(String.valueOf(sb));
        return revX;
    }
}
