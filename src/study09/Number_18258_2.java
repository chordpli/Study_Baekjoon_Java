package study09;

/*
push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Number_18258_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // print 사용시 시간초과 발생.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // int형 queue 선언, linkedList 이용.
        Queue<Integer> queue = new LinkedList<>();

        // 명령의 수 N
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // 명령
            String input = br.readLine();
            //push를 위한 StringTokenizer
            StringTokenizer st = new StringTokenizer(input);

            String input1 = st.nextToken();

            if (input1.equals("push")) {
                int number = Integer.parseInt(st.nextToken());
                queue.add(number);
            } else if (input1.equals("pop")) {
                if (queue.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(queue.poll()));
                    bw.newLine();
                }
            } else if (input1.equals("size")) {
                bw.write(String.valueOf(queue.size()));
                bw.newLine();
            } else if (input1.equals("empty")) {
                if (queue.isEmpty()) {
                    bw.write("1");
                    bw.newLine();
                } else {
                    bw.write("0");
                    bw.newLine();
                }
            } else if (input1.equals("front")) {
                if (queue.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(queue.peek()));
                    bw.newLine();
                }
            } else if (input1.equals("back")) {
                if (queue.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(((LinkedList<Integer>) queue).get(queue.size() - 1)));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

/*
큐는 먼저 들어간 데이터를 먼저 꺼내는 FIFO(First In First Out, 선입선출)로
최근 사용문서, 인쇄 작업 대기목록, 버퍼(buffer)등의 기능을 구현할 때 활용

스택은 나중에 들어간 데이터를 먼저 꺼내는 LIFO(Last In First Out, 후입선출)로
unfo/redo, 또는 웹 브라우저의 뒤로/앞으로 같은 기능을 구현할 때 활용

 */