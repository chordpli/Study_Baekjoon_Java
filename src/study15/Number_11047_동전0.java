package study15;

import java.util.Scanner;

public class Number_11047_동전0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 동전의 종류 N
        int N = Integer.parseInt(sc.next());
        // 가치의 합
        int K = sc.nextInt();

        // 동전 갯수 확인
        int count = 0;
        // 만들어진 현재 돈의 가치
        int money = 0;

        // 동전의 종류를 배열에 저장.
        int[] coins = new int[N];

        // 돈의 가치가 오름차순으로 입력되므로
        // 입력은 오름차순이나 대입은 내림차순으로 진행되도록 i--를 사용.
        for (int i = N - 1; i >= 0; i--) {
            coins[i] = sc.nextInt();
        }

        // 현재 돈의 가치가 K와 동일해질때까지 반복
        while (money != K) {

            for (int i = 0; i < N; i++) {
                
                // money와 K가 같아지면 반복분을 끝낼 수 있도록 i 값 대입
                // 무의미한 반복을 없애기 위해서 추가
                if (money == K) {
                    i = N - 1;
                }

                // coins[i]의 값이 가치의 합 K보다 작거나 같으면서
                // money + coins[i]가 가치의 합 K보다 작거나 같을 때 반복문을 진행한다.
                
                if (coins[i] <= K && money + coins[i] <= K) {
                    money += coins[i];
                    // 동전을 추가하였으므로 count 증가.
                    count++;
                    
                    // 4000원일때 100원을 더하고, 다시 한 번 100원을 더해야 하므로
                    // 같은 배열(coins[i]) 을 가지고 반복할 수 있게 i 값을 감소시킨다.
                    // 만약 4200원에서 i--를 해서 반복한다면
                    // money(4200)+coins[i] (=100) <=K 의 조건에 걸려
                    // 조건문이 발동하지 않기 때문에 걱정하지 않아도 된다.
                    i--;
                }
            }
        }
        System.out.println(count);
    }
}
