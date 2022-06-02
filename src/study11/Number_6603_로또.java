package study11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;

public class Number_6603_로또 {

    // 로또 조합할 숫자 K ( 6 < k < 13)
    // 조합할 카드의 집합 S
    static int K;
    static String[] arr;
    static boolean[] visited;

    static Set<String> lotto;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){

            // 초기화
            String input = br.readLine();

            StringTokenizer st = new StringTokenizer(input);

            K = Integer.parseInt(st.nextToken());

            if(K == 0){
                break;
            }
            arr = new String[K];

            for(int i = 0; i < K; i++){
                arr[i] = st.nextToken();
            }
            visited = new boolean[K];

            process(0, 0);
            System.out.println();

        }
    }

    public static void process(int start, int depth){
        if(depth == 6){
            for(int i = 0; i < K; i++){
                if(visited[i]){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        for(int i = start; i < K; i ++){
            visited[i] = true;
            process(i+1, depth+1);

            visited[i] = false;
        }
    }
}
