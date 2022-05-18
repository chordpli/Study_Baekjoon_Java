package study07;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> iArr = new ArrayList<Integer>();

        // 해당 숫자만큼 반복하여 더하기 위한 count 변수 설정
        int count = 1;

        // 아래 반복문에서 1을 추가할 수 없기에 미리 1을 추가함.
        iArr.add(1);

        while(true){
            // arrayList의 크기가 1000이 넘으면 중지.
            if(iArr.size() >= 1000){
                break;
            }else{ // count 수만큼 반복하면서 count를 계속해서 arrayList에 추가.
                for(int i = 0; i < count; i++){
                    iArr.add(count);
                }
            }
            // 추가되었으면 count의 숫자로 증가시킨다.
            count++;
        }

        int a = Integer.parseInt(sc.next());
        int b = sc.nextInt();
        int result = 0;

        // a부터 b까지 반복하며 해당 arrayList를 불러와 result에 더하여 저장한다.
        for(int i= a; i <= b; i++ ){
            result += iArr.get(i);
        }

        System.out.println(result);


    }
}

/*
        while(true){

            if(iArr.size() >= 1000){
                break;
            }else{
                for(int i = 0; i < count; i++){
                    iArr.add(count);
                }
            }

            count++;
        }
 */