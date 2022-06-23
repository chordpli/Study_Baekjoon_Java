package study17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Number_9372_상근이의여행 {
    static int T, N, M;
    static Map<Integer, Integer> trip;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();
        for(int i = 0 ; i < T; i++){
            N = Integer.parseInt(sc.next());
            M = sc.nextInt();
            trip = new HashMap<>();

            for(int j = 0; j < M; j++){
                trip.put(Integer.parseInt(sc.next()), sc.nextInt());
            }
            System.out.println(N-1);
        }

    }
}
