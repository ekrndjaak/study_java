package BAEKJOON;

import java.util.*;
public class m1205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T_score = sc.nextInt();
        int P = sc.nextInt();
        ArrayList rank = new ArrayList<>();
        for(int i = 0; i<N; i++){
            rank.add(sc.nextInt()); // 랭킹리스트에 점수 입력
        }
        rank.add(T_score);
        Collections.sort(rank,Collections.reverseOrder()); //내림차순


    }
}
