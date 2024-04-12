package BAEKJOON;

import java.util.Scanner;

public class m1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        int [] cnt = new int[10];

        for(int i = 0; i < num.length(); i++){
            int digit = Character.getNumericValue(num.charAt(i));
            cnt[digit]++;
        }
        cnt[6] = (cnt[6] + cnt[9] + 1) / 2;
        cnt[9] = 0;

        int max = 0;
        for(int i = 0; i < 10; i++){
            max = Math.max(max, cnt[i]);
        }
        System.out.println(max);
    }
}
