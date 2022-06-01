package study11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/*
상근이는 카드 n(4 ≤ n ≤ 10)장을 바닥에 나란히 놓고 놀고있다. 각 카드에는 1이상 99이하의 정수가 적혀져 있다.
상근이는 이 카드 중에서 k(2 ≤ k ≤ 4)장을 선택하고, 가로로 나란히 정수를 만들기로 했다. 상근이가 만들 수 있는 정수는 모두 몇 가지일까?

예를 들어, 카드가 5장 있고, 카드에 쓰여 있는 수가 1, 2, 3, 13, 21라고 하자. 여기서 3장을 선택해서 정수를 만들려고 한다.
2, 1, 13을 순서대로 나열하면 정수 2113을 만들 수 있다. 또, 21, 1, 3을 순서대로 나열하면 2113을 만들 수 있다.
이렇게 한 정수를 만드는 조합이 여러 가지 일 수 있다.

n장의 카드에 적힌 숫자가 주어졌을 때, 그 중에서 k개를 선택해서 만들 수 있는 정수의 개수를 구하는 프로그램을 작성하시오.
 */
public class Number_5568_카드놓기 {
    // 바닥에 놓인 카드의 갯수 N
    // 선택할 카드의 갯수 K
    // 바닥에 놓인 카드의 숫자 card[]
    static int N, K, card[];
    static boolean visited[];
    // 중복 정수의 저장을 막기 위한 Set 사용
    static Set<Integer> setNum;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());


        // 초기화(init)
        visited = new boolean[11];
        card = new int[N];
        setNum = new HashSet<Integer>();

        for(int i =0; i<N; i++){
            card[i] = Integer.parseInt(br.readLine());
        }

        process(0, 0);
        System.out.println(setNum.size());
    }

    public static void process(int count, int num){
        // K 개수만큼 카드가 선택되었을 경우, Set에 add한다.
        if (count == K) {
            setNum.add(num);
            return;
        }
        for (int i =0; i < N; i++){
            // 이미 사용된 카드면 pass
            if(visited[i]){
                continue;
            }
            // 사용되지 않은 카드라면 사용한다.
            visited[i] = true;

            int tmp;
            if(card[i] > 9){
                tmp = num * 100 + card[i];
            }else{
                tmp = num*10+card[i];
            }
            // 위의 카드를 사용했으니 count+1를 하고 만들어진 숫자를 함께 재귀함수로 넘긴다.
            process(count+1, tmp);

            visited[i] = false;
        }

    }
}
