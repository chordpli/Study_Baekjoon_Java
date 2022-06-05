package study12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number_1977_완전제곱수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] square = new int[102];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= 101; i++) {
            square[i] = i * i;
        }

        // 작은 수
        int M = sc.nextInt();
        // M보다 큰 수
        int N = sc.nextInt();
        int count = 0;

        while (true) {

            if (M > square[count]) {
                count++;
                continue;
            } else if (N < square[count]) {
                break;
            }

            result.add(square[count]);

            count++;
        }

        int sum = 0;

        if(result.size()==0){
            System.out.println(-1);
        }else{
            for (int i = 0; i < result.size(); i++) {
                sum += result.get(i);
            }

            System.out.println(sum);
            System.out.println(result.get(0));
        }
    }
}
