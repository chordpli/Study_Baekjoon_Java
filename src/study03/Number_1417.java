package study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_1417 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());        // 후보 수
        int dasom = Integer.parseInt(bf.readLine());	// 다솜이 찍으려는 투표 수

        int[] arr = new int[N-1];	                    // 각 후보를 찍는 투표 수(다솜을 따로 제외했기 때문에 -1)
        for(int i=0; i<arr.length; i++)                 // 후보 수 만큼 반복.
            arr[i] = Integer.parseInt(bf.readLine());

        int min = 0;	// 매수해야하는 사람의 최솟값
        if(N == 1) {	// 후보가 자신 혼자인경우
            System.out.println("0");
            return;
        }

        while(true) {
            Arrays.sort(arr);
            boolean flag = true;
            int last = arr.length-1;	// 가장 투표가 많은 후보의 인덱스
            // 후보중 가장 높은 투표를 받은 후보가 다솜이의 투표수 이상인경우
            if(dasom <= arr[arr.length-1]) {
                dasom ++;	// 다솜이 투표 +1
                arr[last] --;	// 가장 높은 투표를 받는 후보 -1
                min ++;		// 한명 매수
                flag = false;	// 다솜이가 당선이 되지 못했으므로 false로 설정
            }
            if(flag)	// 다솜이보다 높은 투표수가 없는경우
                break;
        }
        System.out.println(min);
        bf.close();
    }

}





