package study15;

import java.util.Scanner;

public class Number_10709_기상캐스터 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 남북
        int H = Integer.parseInt(sc.next());
        // 동서
        int W = sc.nextInt();

        String[][] HW = new String[H][W];
        int count;
        sc.nextLine();

        for(int i = 0; i < H; i++){
            String input = sc.nextLine();
            for(int j = 0 ; j < W; j++){
                HW[i][j] = String.valueOf(input.charAt(j));
            }
        }

        for(int i = 0; i < H; i++){
            count = -1;
            for(int j = 0 ; j < W; j++){
                if(HW[i][j].equals("c")){
                    HW[i][j] = String.valueOf(0+" ");
                    count = 1;
                }else if (count>0){
                    HW[i][j] = String.valueOf(count+" ");
                    count++;
                }else{
                    HW[i][j] = String.valueOf(count+" ");
                }
            }
        }

        for(int i = 0; i < H; i++){
            for(int j = 0 ; j < W; j++){
                System.out.print(HW[i][j]);
            }
            System.out.println();
        }
    }
}
