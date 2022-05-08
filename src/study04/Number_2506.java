package study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int question = Integer.parseInt(br.readLine());
        String[] ans = br.readLine().split(" ");

        int sum = 0;
        int count = 1;

        for(int i = 0; i < ans.length-1; i++){
            if(ans[i].equals("1") && ans[i+1].equals("1")){
                sum += count;
                count++;
            }else if(ans[i].equals("1") && ans[i+1].equals("0")){
                sum += count;
                count = 1;
            }

        }
        if(!ans[ans.length-1].equals("0") && !ans[ans.length-2].equals("0")){
            sum += count;
        }

        System.out.println(sum);
        br.close();
    }
}
