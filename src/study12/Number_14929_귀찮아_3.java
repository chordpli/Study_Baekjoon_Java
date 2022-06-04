package study12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_14929_귀찮아_3 {
    static int result;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        nums = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        result = 0;

        sum(0, 1);

        System.out.println(result);
    }

    public static void sum(int a, int b) {
        if (a == nums.length || b == nums.length) {
            return;
        }

        if (b + 1 == nums.length) {
            sum(a + 1, a + 2);
            result = result + (nums[a] * nums[b]);
        } else {
            result = result + (nums[a] * nums[b]);
            sum(a, b + 1);
        }
    }
}