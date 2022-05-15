package study06;

import java.util.Scanner;

public class Number_3054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] sArr = new String[5];

        // 기호
        sArr[0] = "..#..";
        sArr[4] = "..#..";

        // 첫번째, 다섯번째 기호 저장
        for (int i = 1; i < input.length(); i++) { // i = 1인 이유는 0번째는 위에 선언.
            if (i % 3 == 2) { // 3의 배수인 곳. 웬디 프레임 ('*')이 들어가는 곳
                sArr[0] += ".*.."; // 그냥 대입이 아닌 += 으로 추가하고 있다는 것을 확인.
                sArr[4] += ".*..";
            } else { // 피터팬 프레임('#')이 들어가는 곳
                sArr[0] += ".#..";
                sArr[4] += ".#..";
            }
        }

        // 두번째 네번째 기호 저장
        sArr[1] = ".#.#.";
        sArr[3] = ".#.#.";

        for (int i = 1; i < input.length(); i++) {
            if (i % 3 == 2) { // 3의 배수인 곳. 웬디 프레임('*')이 들어가는 곳
                sArr[1] += "*.*.";
                sArr[3] += "*.*.";
            } else {
                sArr[1] += "#.#.";
                sArr[3] += "#.#.";
            }
        }

        // 세번 째 기호 저장
        sArr[2] = "#." + input.charAt(0) + ".#"; // #.A.#

        for (int i = 1; i < input.length(); i++) {
            if (i % 3 == 1) { // 3의 배수 앞에 오는 문자
                sArr[2] += "." + input.charAt(i);

                /*
                문자열의 길이가 3 또는 5일 때
                DOG -> 예제와 같이 0에서 끝날 때 ".*"이 불어야 한다.
                DOGDO -> 마지막에 끝날 때 3의 배수위치가 아니므로 ".#"으로 끝나야 한다.
                 */

                if (i == input.length() - 1) {
                    sArr[2] += ".#";
                } else {
                    sArr[2] += ".*";
                }
            } else if (i % 3 == 2) { // 가장 마지막 문자 (3의 배수 위치)
                sArr[2] += "." + input.charAt(i) + ".*";
            } else { // 가장 첫 번째 문자
                sArr[2] += "." + input.charAt(i) + ".#";
            }
        }

        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }
        sc.close();
    }
}
