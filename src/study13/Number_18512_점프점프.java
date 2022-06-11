package study13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Number_18512_점프점프 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int px = Integer.parseInt(st.nextToken());
        int py = Integer.parseInt(st.nextToken());

        TreeSet<Integer> result = new TreeSet<>();

        if(x == 1 && y == 1){
            if(px>py){
                result.add(px);
            }else{
                result.add(py);
            }
        }else{
            for(int i = 1; i <= 100; i++){
                for(int j = 1; j <= 100; j++){
                    if(((x*i)+px) == ((y*j)+py)){
                        result.add(x*i+px);
                    }
                }
            }
        }

        if(result.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(result.first());
        }

        br.close();
    }
}