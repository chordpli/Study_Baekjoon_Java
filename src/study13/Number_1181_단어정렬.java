package study13;

import java.util.*;

public class Number_1181_단어정렬 {

    static ArrayList<String> sArr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextLine());
        }

        sArr = new ArrayList<>();

        for (int i = 0; i < set.size(); ) {
            sArr.add(set.pollFirst());
        }

        Comparator<String> c = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        Collections.sort(sArr, c);

        for (int i = 0; i < sArr.size(); i++) {
            System.out.println(sArr.get(i));
        }
    }
}

// lambda