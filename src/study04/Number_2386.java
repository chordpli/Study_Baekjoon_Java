package study04;

import java.util.Scanner;

public class Number_2386 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int count = 0;
            String input = sc.next();

            if(input.equals("#")){
                break;
            }
            String sentence = sc.nextLine().toLowerCase();

            for(int i = 0; i < sentence.length(); i++){
                if(input.charAt(0) == sentence.charAt(i)){
                    count++;
                }
            }
            System.out.println(input + " " + count);
        }
    }
}
//