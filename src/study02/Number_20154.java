package study02;

import java.util.Scanner;

public class Number_20154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력한다.
        String input = sc.nextLine().toUpperCase().trim();

        // 입력받은 문자열을 배열에 저장한다.
        String[] inputArray = new String[input.length()];
        inputArray = input.split("");

        // 문자열을 숫자로 변환하여 저장한다.
        int[] firstScore = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            switch (inputArray[i]) {
                case "A":
                case "E":
                case "F":
                case "G":
                case "H":
                case "K":
                case "M":
                case "N":
                    firstScore[i] = 3;
                    break;
                case "B":
                case "D":
                case "P":
                case "Q":
                case "R":
                case "T":
                case "W":
                case "X":
                case "Y":
                    firstScore[i] = 2;
                    break;
                default:
                    firstScore[i] = 1;
                    break;
            }
        }

        int sum = 0;

        for (int i = 0; i<firstScore.length; i++){
            sum += firstScore[i];
        }

        if (sum%2 == 0){
            System.out.println("You're the winner?");
        } else if(sum%2 == 1){
            System.out.println("I'm a winner!");
        }

        sc.close();
    }
}
