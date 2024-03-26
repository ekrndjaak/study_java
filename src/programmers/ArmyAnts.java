package programmers;

import java.util.Scanner;

public class ArmyAnts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hp = sc.nextInt();

        int a = hp / 5;
        hp %= 5;
        int b = hp / 3;
        hp %= 3;

        int answer = a + b + hp;
        System.out.println(answer);
    }
}
