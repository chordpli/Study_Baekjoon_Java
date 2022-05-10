//꿍은 도비의 자유를 위해 영어를 가르치기로 결심했다. 하지만 도비는 바보라 ABC부터 배워야 한다.
//그래서 꿍은 영어 문장과 알파벳 하나가 주어지면 그 알파벳이 문장에서 몇 번 나타나는지를 세는 문제들을 내주었다. 하지만 도비는 마법사고 컴공도 마법사다.
//여러분은 도비를 위해 문제의 답을 알려주는 프로그램을 만들수 있을것이다!


//입력은 몇 개의 줄들로 이루어진다.
//각 줄에는 하나의 소문자와 영어 문장이 공백으로 구분되어 주어진다.
//각 문장은 길이가 1에서 250이며 입력의 마지막은 #이다.

//출력의 각 줄은 입력으로 주어진 소문자와 그 소문자 알파벳이 나타난 횟수로 이루어진다. 
//이때 문장에서 해당 알파벳이 소문자로 나타나던 대문자로 나타나던 모두 세야 한다.


package study04;

import java.util.Scanner;

public class Number_2386 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력의 마지막은 #이므로 #이 나오기 전까지 무한 반복.
        while(true){
            // 주어진 소문자 횟수를 담을 정수형 변수 count 선언
            int count = 0;
            
            // 주어진 소문자 알파벳을 입력
            String input = sc.next();

            // #이 나올 경우 반복문을 정지시킨다.
            if(input.equals("#")){
                break;
            }
            // 문장을 입력받는다.
            String sentence = sc.nextLine().toLowerCase();

            // 주어진 문자와 문장의 문자 하나하나를 비교할 것이므로
            // 문장의 길이만큼 반복문을 진행시킨다.
            for(int i = 0; i < sentence.length(); i++){
                //입력된 소문자(0)와 문장의 문자(i)를 비교
                // 같은 문자일 경우에 count 증가.
                if(input.charAt(0) == sentence.charAt(i)){
                    count++;
                }
            }
            System.out.println(input + " " + count);
        }
    }
}