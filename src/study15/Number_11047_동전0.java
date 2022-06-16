package study15;

import java.util.Scanner;

public class Number_11047_동전0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = sc.nextInt();
        int count = 0;
        int money = 0;
        int[] coins = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            coins[i] = sc.nextInt();
        }

        while (money != K) {

            for (int i = 0; i < N; i++) {
                if (money == K) {
                    i = N - 1;
                }
                if (coins[i] <= K && money + coins[i] <= K) {
                    money += coins[i];
                    count++;
                    i--;
                }
            }
        }
        System.out.println(count);
    }
}
