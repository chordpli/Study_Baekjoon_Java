package study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_2520 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());

        double dough;

        for (int i = 0; i < times; i++) {
            String input01 = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(input01);
            int pancake = 0;

            double[] ingredient = new double[input01.split(" ").length];
            if (ingredient.length == 5) { // NoSuchElementException 피하기 위해 사용.
                ingredient[0] = Double.parseDouble(st.nextToken()) / 8; // 우유
                ingredient[1] = Double.parseDouble(st.nextToken()) / 8; // 노른자
                ingredient[2] = Double.parseDouble(st.nextToken()) / 4; // 설탕
                ingredient[3] = Double.parseDouble(st.nextToken());     // 소금
                ingredient[4] = Double.parseDouble(st.nextToken()) / 9; // 밀가루
            } else {
                for (int j = 0; j < ingredient.length; j++) {
                    ingredient[j] = 0;
                }
            }

            dough = ingredient[0];

            for (int j = 0; j < ingredient.length; j++) {
                if (ingredient[j] <= dough) {
                    dough = ingredient[j];
                }
            }

            dough = (int) (dough * 16);

            String input02 = br.readLine().trim();
            StringTokenizer st02 = new StringTokenizer(input02);
            int[] topping = new int[input02.split(" ").length];
            if (topping.length == 4) {
                topping[0] = Integer.parseInt(st02.nextToken());        // 바나나 1개
                topping[1] = Integer.parseInt(st02.nextToken()) / 30;   // 딸기잼 30g
                topping[2] = Integer.parseInt(st02.nextToken()) / 25;   // 스프레드 25그램
                topping[3] = Integer.parseInt(st02.nextToken()) / 10;   // 호두 10개
            } else {
                for (int j = 0; j < topping.length; j++) {
                    topping[j] = 0;
                }
            }

            for (int j = 0; j < topping.length; j++) {
                if (dough - topping[j] > 0 && topping[j] > 0) {
                    dough = dough - topping[j];
                    pancake += topping[j];
                } else if (dough > 0 && dough - topping[j] <= 0) {
                    int a = topping[j] - (int)dough;    // 토핑 - 도우
                    int b = topping[j] - a;             // 토핑 - (토핑-도우) // 남은 도우 갯수랑 동일
                    dough -= b;
                    pancake += b;
                    break;
                }
            }
            System.out.println(pancake);
        }
        br.close();
    }
}

//16 16 8 2 17
//10 47 100 19