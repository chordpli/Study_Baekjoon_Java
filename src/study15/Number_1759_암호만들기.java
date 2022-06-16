package study15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Number_1759_암호만들기 {
    static int L, C;
    static String[] cd;
    static boolean[] visited = new boolean[16];
    static TreeSet<String> result = new TreeSet<String>();
    static StringBuilder sb = new StringBuilder();
    static ArrayList<String> check = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        cd = new String[C];

        for (int i = 0; i < C; i++) {
            cd[i] = st.nextToken();
        }

        Arrays.sort(cd);

        search(0);

        System.out.println(result);

    }

    public static void search(int num) {


        if(sb.length()>1){
            if (check.get(check.size()-1).compareTo(check.get(check.size()-2))>0) {
                if (sb.length() == L) {
                    result.add(String.valueOf(sb));
                    return;
                }
            } else {
                return;
            }
        }

        for (int i = 0; i < L; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            sb.append(cd[i]);
            check.add(cd[i]);
            search(num + 1);

            visited[i] = false;
        }

    }
}
