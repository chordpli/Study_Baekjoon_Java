package study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Number_1302_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 오늘 하루동안 팔린 책의 개수 N
        int N = Integer.parseInt(br.readLine());

        TreeMap<String, Integer> book = new TreeMap();

        // 트리맵에 판매된 책들을 저장
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
        Map.Entry<String, Integer> maxEntry = null;

        //Iterator
        Set<Map.Entry<String, Integer>> entrySet = book.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet){
            if(maxEntry == null || entry.getValue() > (maxEntry.getValue())){
                maxEntry = entry;
            }
        }

        System.out.println(maxEntry.getKey());

        br.close();
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