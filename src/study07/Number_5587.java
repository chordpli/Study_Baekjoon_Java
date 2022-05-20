package study07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Number_5587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        // 카드의 갯수
        int card = 2 * sc.nextInt();
        ArrayList<Integer> sang = new ArrayList<>();
        ArrayList<Integer> geun = new ArrayList<>();

        for(int i = 0; i < card/2; i++){
            sang.add(sc.nextInt());
        }

        for(int i = 1; i <= card; i++){
            geun.add(i);
        }

        Collections.sort(sang);
        Collections.sort(geun);

        for(int i = 0; i < geun.size(); i++){
            for(int j = 0; j < sang.size(); j++){
                if(geun.get(i).equals(sang.get(j))){
                    geun.remove(i);
                    i = i-1;
                    break;
                }
            }
        }

        for(int i =0; i < card/2 ; i++){
            if(sang.get(0) < geun.get(i)){
                sang.remove(0);
            }
        }


        System.out.println(sang.size());


        sc.close();
    }
}
