package study06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Number_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        // 듣도 못한 사람의 수
        int n = Integer.parseInt(st.nextToken());
        // 보도 못한 사람의 수
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();
        for(int i =0; i < m; i++){
            String tmp = br.readLine();
            if(set.contains(tmp)){
                result.add(tmp);
            }
        }
        Collections.sort(result);

        System.out.println(result.size());
        for(String s : result){
            System.out.println(s);
        }

    }
}
