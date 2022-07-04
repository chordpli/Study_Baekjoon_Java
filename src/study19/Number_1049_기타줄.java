package study19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_1049_기타줄 {

    // 기타줄 N
    static int N;
    // 기타줄 브랜드 M
    static int M;
    static int minSet;
    static int minPiece;
    static int result;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        minSet = Integer.parseInt(st.nextToken());
        minPiece = Integer.parseInt(st.nextToken());

        for(int i = 1; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int set = Integer.parseInt(st.nextToken());
            int piece = Integer.parseInt(st.nextToken());

            if(set <= minSet){
                minSet = set;
            }

            if(piece <= minPiece){
                minPiece = piece;
            }
        }

        if(minPiece * 6 <= minSet){
            result = minPiece * N;
            System.out.println(result);
        }else{
            int A = minSet * (N/6) + minPiece * (N-((N/6)*6));
            int B = minSet * ((N/6)+1);
            if(A > B){
                result = B;
            }else{
                result = A;
            }
            System.out.println(result);
        }
    }
}
