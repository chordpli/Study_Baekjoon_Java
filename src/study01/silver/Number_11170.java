package study01.silver;

import java.io.*;
import java.util.StringTokenizer;

public class Number_11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter((new OutputStreamWriter(System.out)));
        ////////// 테스트 케이스 수 T //////////
        int t = Integer.parseInt(br.readLine().trim());

        for(int i = 0; i < t; i ++){
            String strCase = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(strCase);

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            Integer count = 0;

            for(int j = n; j <= m; j++){
                String str = Integer.toString(j);
                String[] strArr = str.split("");

                for(int k = 0; k < strArr.length; k++){
                    if(strArr[k].equals("0")){
                        count++;
                    }
                }
            }
            bw.write(count.toString() + "\n");

            //System.out.println(count);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
