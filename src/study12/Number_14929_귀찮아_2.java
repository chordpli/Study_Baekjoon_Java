package study12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Number_14929_귀찮아_2 {
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

        process(0, 1);

        System.out.println(result);
    }

    public static void process(int a, int b) {
        if (a == xList.size() || b == xList.size()) {
            return;
        }

        if (b + 1 == xList.size()) {
            process(a + 1, a + 2);
            result = result + (xList.get(a) * xList.get(b));
            return;
        } else {
            result = result + (xList.get(a) * xList.get(b));
            process(a, b + 1);
        }
    }
}