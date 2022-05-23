package study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

public class Number_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 오늘 하루동안 팔린 책의 개수 N
        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> book = new HashMap();

        // 해시맵에 판매된 책들을 저장
        for(int i = 0; i < N ; i++){
            String input = br.readLine();

            // 해당 키가 존재한다면 밸류값만 증가
            if(book.containsKey(input)){
                book.put(input, book.get(input) + 1);
            } else{ // 키가 존재하지 않으면 1로 선언.
                book.put(input, 1);
            }
        }
        //Max
        Entry<String, Integer> maxEntry = null;

        //Iterator
        Set<Entry<String, Integer>> entrySet = book.entrySet();
        for(Entry<String, Integer> entry : entrySet){
            if(maxEntry == null || entry.getValue() > (maxEntry.getValue())){
                maxEntry = entry;
            }
        }

        System.out.println(maxEntry.getKey());
    }
}


/*

// 내림 차순
        // Map.Entry 리스트 작성
        List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(book.entrySet());

        // 비교함수 Comparator를 사용하여 내림차순으로 정렬
        Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

                // 내림차순으로 정렬
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Set<String> keySet = book.keySet();

        for (String key : keySet) {
            System.out.println(key + " : " + book.get(key));
        }
 */