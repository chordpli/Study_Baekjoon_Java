package study04;

import java.util.Scanner;

public class Number_1969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DNA수
        int number = Integer.parseInt(sc.next());
        //입력된 DNA 길이
        int len = Integer.parseInt(sc.next());
        // 개행 오류 방지
        sc.nextLine();

        // number에 입력된 수만큼 String 자료형의 DNA 배열 생성
        String[] DNA = new String[number];

        // number만큼 반복하면서 DNA를 입력받는다.
        for (int i = 0; i < number; i++) {
            DNA[i] = sc.nextLine();
        }

        // Hamming Distance의 합을 저장
        int sumHD = 0;
        
        // 문자들을 추가하기 위한 StringBuilder 생성
        StringBuilder sd = new StringBuilder();

        // DNA의 길이(len)만큼 반복한다.
        // 같은 열의 DNA를 비교해야하기 때문에 다중 반복문을 사용한다.
        for (int i = 0; i < len; i++) {
            // 제일 많이 나온 DNA를 체크해야하기 때문에 변수를 생성하여 저장한다.
            int T = 0, A = 0, G = 0, C = 0, max = 0;
            int HD = 0;

            for (int j = 0; j < number; j++) {
                if (DNA[j].charAt(i) == 'A') {
                    A++;
                } else if (DNA[j].charAt(i) == 'T') {
                    T++;
                } else if (DNA[j].charAt(i) == 'G') {
                    G++;
                } else if (DNA[j].charAt(i) == 'C') {
                    C++;
                }
            }
            // 알파벳 순서대로 나와야하기 때문에 A C G T 순서로 조건문을 작성함.
            // DNA의 숫자가 동일할 경우 이른 순서의 알파벳을 출력하기 때문에
            // >= 기호를 사용한다.
            if (A >= T && A >= G && A >= C) {
                max = A;
                sd.append("A");
            } else if (C >= A && C >= G && C >= T) {
                max = C;
                sd.append("C");
            } else if (G >= A && G >= C && G >= T) {
                max = G;
                sd.append("G");
            } else {
                max = T;
                sd.append("T");
            }
            // 같은 열에 있는 알파벳을 비교하기 때문에
            // number(DNA의 갯수)에서 max(제일 많이 나온 DNA알파벳의 숫자의 합)을 뺀다.
            HD = number - max;
            sumHD += HD;
        }

        System.out.println(sd);
        System.out.println(sumHD);
        sc.close();
    }
}
