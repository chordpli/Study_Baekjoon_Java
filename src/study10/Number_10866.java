package study10;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/*
정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여덟 가지이다.

push_front X: 정수 X를 덱의 앞에 넣는다.
push_back X: 정수 X를 덱의 뒤에 넣는다.
pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 덱에 들어있는 정수의 개수를 출력한다.
empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
public class Number_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 덱 선언
        Deque<Integer> deque = new ArrayDeque<>();

        // 주어지는 명령의 수 N
        int N = Integer.parseInt(br.readLine());

        // 명령 진행
        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            StringTokenizer st = new StringTokenizer(a);
            String input = st.nextToken();

            if (input.equals("push_front")) {
                int value = Integer.parseInt(st.nextToken());
                deque.addFirst(value);
            } else if (input.equals("push_back")) {
                int value = Integer.parseInt(st.nextToken());
                deque.addLast(value);
            } else if (input.equals("pop_front")) {
                if (deque.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(deque.removeFirst()));
                    bw.newLine();
                }
            } else if (input.equals("pop_back")) {
                if (deque.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(deque.removeLast()));
                    bw.newLine();
                }
            } else if (input.equals("size")) {
                bw.write(String.valueOf(deque.size()));
                bw.newLine();
            } else if (input.equals("empty")) {
                if (deque.isEmpty()) {
                    bw.write("1");
                    bw.newLine();
                } else {
                    bw.write("0");
                    bw.newLine();
                }
            } else if (input.equals("front")) {
                if (deque.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(deque.getFirst()));
                    bw.newLine();
                }
            } else if (input.equals("back")) {
                if (deque.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(deque.getLast()));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}