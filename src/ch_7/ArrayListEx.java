package ch_7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("이름을 입력하세요>>");
            String s = scanner.next();
            a.add(s); // ArrayList 컬렉션 삽입
        }
        for (int i = 0; i < a.size(); i++) {
            String name = a.get(i);
            System.out.println(name + "  ");
        }
        int longestIndex = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(longestIndex).length() < a.get(i).length())
                longestIndex = i;
        }
        System.out.println("\n 가장 긴 이름은 : " + a.get(longestIndex));
    }
}
