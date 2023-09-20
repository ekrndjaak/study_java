package java_study.Practice;

import java.util.Scanner;

public class Pita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("직각 삼각형의 한변의 길이 a :");
        int a = scanner.nextInt();

        System.out.println("직각 삼각형의 다른 변의 길이 b :");
        int b = scanner.nextInt();

        int c = (int) Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("빗변의 길이 C : " + c);
    }
}
