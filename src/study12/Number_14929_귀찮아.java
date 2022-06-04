package study12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Number_14929_귀찮아 {
    static int result;
    static List<Integer> xList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        result = 0;

        StringTokenizer st = new StringTokenizer(input);
        xList = new ArrayList<Integer>();

        while (st.hasMoreTokens()) {
            xList.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < xList.size(); j++) {
                result += xList.get(i) * xList.get(j);
            }
        }
        System.out.println(result);
    }
}
