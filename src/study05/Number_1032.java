package study05;

import java.util.Scanner;

public class Number_1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 이름의 갯수
        int times = sc.nextInt();

        String[] files = new String[times];
        sc.nextLine(); // 개행문자 오류 방지

        for (int i = 0; i < files.length; i++) {
            files[i] = sc.nextLine();
        }

        for (int i = 1; i < files.length; i++) {
            for (int j = 0; j < files[0].length(); j++) {
                if (files[0].charAt(j) != files[i].charAt(j)) {
                    // substring은 문자열을 자르는 함수
                    // substring(j+1)은 j+1번째에 위치한 문자열을 포함하여 그 이후로 다 리턴.
                    // SubString(0,j)는 0에서부터 j번째 앞 부분까지의 값을 리턴
                    // 즉 j번째의 문자를 바꾸기 원하므로
                    // j번째 앞에서 문자를 자르고 + '?' + 원하는 문자를 작성 후 이어 붙이는 방법.
                    files[0] = files[0].substring(0, j) + '?' + files[0].substring(j + 1);
                }
            }
        }

        System.out.println(files[0]);
        sc.close();
    }
}
