package study11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Number_16943_숫자재배치 {

    /*
     * 두 정수 A와 B가 있을 때, A에 포함된 숫자의 순서를 섞어서 새로운 수 C를 만들려고 한다.
     * 즉, C는 A의 순열 중 하나가 되어야 한다.
     * 가능한 C 중에서 B보다 작으면서, 가장 큰 값을 구해보자.
     * C는 0으로 시작하면 안 된다.
     *
     * B보다 작은 C중에서 가장 큰 값을 출력한다. 그러한 C가 없는 경우에는 -1을 출력한다.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        String st1 = st.nextToken();
        String st2 = st.nextToken();

        List<Integer> A = new ArrayList<Integer>();
        List<Integer> B = new ArrayList<Integer>();
        List<Integer> C = new ArrayList<Integer>();   //출력

        for(int i=0; i<st1.length(); i++) {
            A.add(st1.charAt(i) - '0');
        }

        for(int i=0; i<st2.length(); i++) {
            B.add(st2.charAt(i) - '0');
        }

        Collections.sort(A);; //A만 정렬
        //System.out.println(A);
        //System.out.println(B);

        if(A.size()<B.size()) { //자리수가 B가 더 크면 A는 어떻게 정렬해도 B>A 큰 순서대로 나열해주면 가장 큰 숫자 C
            for(int i=A.size()-1; i>=0; i--) {
                System.out.print(A.get(i));
            }
        }else if(A.size()==B.size()){

            for(int j=0; j<B.size(); j++) {
                if(A.size()==0) {
                    break; //이미 작은것이 확정돼서 모두 추가했을때
                }
                for(int i=A.size()-1; i>=0; i--) {
                    if(A.get(i)<=B.get(j)) {
                        C.add(A.get(i));
                        A.remove(i);
                        if(C.get(C.size()-1)<B.get(j)) {//마지막에 추가한 게 작으면 그 밑 자리들은 큰 순서대로 나열
                            while(A.size()!=0) {
                                C.add(A.get(A.size()-1));   //가장 큰 것
                                A.remove(A.size()-1);
                            }
                        }//A.size():0 종료
                        break;   //추가했으면 브레이크 B의 다음 자리로 넘어감
                    }
                }
            }

            if(C.size()<st1.length() || C.get(0)==0) {//만들지 못했거나 가장 큰 자리가 0
                System.out.println(-1);
            }else {
                for(int i=0; i<C.size(); i++) {
                    System.out.print(C.get(i));
                }
            }

        }else {   //A.size()>B.size();
            System.out.println(-1);
        }

        br.close();
    }
}